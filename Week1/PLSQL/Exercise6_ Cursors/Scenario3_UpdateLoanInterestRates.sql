SET SERVEROUTPUT ON;

DECLARE

    CURSOR UpdateLoanInterestRates IS
        SELECT LoanID,
               InterestRate
        FROM Loans
        FOR UPDATE;

BEGIN

    FOR loan_rec IN UpdateLoanInterestRates LOOP

        UPDATE Loans
        SET InterestRate = InterestRate - 0.5
        WHERE CURRENT OF UpdateLoanInterestRates;

        DBMS_OUTPUT.PUT_LINE(
            'Loan ID '
            || loan_rec.LoanID
            || ' updated from '
            || loan_rec.InterestRate
            || '% to '
            || (loan_rec.InterestRate - 0.5)
            || '%'
        );

    END LOOP;

    COMMIT;

END;
/