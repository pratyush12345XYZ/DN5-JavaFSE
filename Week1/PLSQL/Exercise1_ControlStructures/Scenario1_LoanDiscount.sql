BEGIN

    FOR cust IN
    (
        SELECT CustomerID,
               Name,
               FLOOR(MONTHS_BETWEEN(SYSDATE,DOB)/12) Age
        FROM Customers
    )

    LOOP

        IF cust.Age > 60 THEN

            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                'Discount applied to ' || cust.Name
            );

        END IF;

    END LOOP;

    COMMIT;

END;
/