CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_loan_amount IN NUMBER,
    p_interest_rate IN NUMBER,
    p_duration_years IN NUMBER
)
RETURN NUMBER
IS
    v_total_interest NUMBER;
    v_total_amount NUMBER;
    v_monthly_installment NUMBER;

BEGIN

    v_total_interest :=
        (p_loan_amount *
         p_interest_rate *
         p_duration_years) / 100;

    v_total_amount :=
        p_loan_amount + v_total_interest;

    v_monthly_installment :=
        v_total_amount /
        (p_duration_years * 12);

    RETURN ROUND(v_monthly_installment,2);

END;
/