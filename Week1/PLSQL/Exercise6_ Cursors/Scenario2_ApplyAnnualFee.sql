SET SERVEROUTPUT ON;

DECLARE

    CURSOR ApplyAnnualFee IS
        SELECT AccountID,
               Balance
        FROM Accounts
        FOR UPDATE;

    v_fee NUMBER := 500;

BEGIN

    FOR acc IN ApplyAnnualFee LOOP

        UPDATE Accounts
        SET Balance = Balance - v_fee
        WHERE CURRENT OF ApplyAnnualFee;

        DBMS_OUTPUT.PUT_LINE(
            'Annual fee of '
            || v_fee
            || ' deducted from Account ID: '
            || acc.AccountID
        );

    END LOOP;

    COMMIT;

END;
/