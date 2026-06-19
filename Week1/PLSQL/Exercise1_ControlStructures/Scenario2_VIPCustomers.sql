ALTER TABLE Customers
ADD IsVIP VARCHAR2(5);

BEGIN

    FOR cust IN
    (
        SELECT CustomerID,
               Name,
               Balance
        FROM Customers
    )

    LOOP

        IF cust.Balance > 10000 THEN

            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust.CustomerID;

            DBMS_OUTPUT.PUT_LINE(
                cust.Name || ' marked as VIP'
            );

        END IF;

    END LOOP;

    COMMIT;

END;
/