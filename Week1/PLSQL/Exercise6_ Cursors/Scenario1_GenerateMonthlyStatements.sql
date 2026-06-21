SET SERVEROUTPUT ON;

DECLARE

    CURSOR GenerateMonthlyStatements IS
        SELECT
            c.CustomerID,
            c.Name,
            t.TransactionID,
            t.TransactionDate,
            t.TransactionType,
            t.Amount
        FROM Customers c
        JOIN Accounts a
            ON c.CustomerID = a.CustomerID
        JOIN Transactions t
            ON a.AccountID = t.AccountID
        WHERE EXTRACT(MONTH FROM t.TransactionDate) =
              EXTRACT(MONTH FROM SYSDATE)
          AND EXTRACT(YEAR FROM t.TransactionDate) =
              EXTRACT(YEAR FROM SYSDATE);

BEGIN

    FOR rec IN GenerateMonthlyStatements LOOP

        DBMS_OUTPUT.PUT_LINE('------------------------------------');
        DBMS_OUTPUT.PUT_LINE('Customer ID      : ' || rec.CustomerID);
        DBMS_OUTPUT.PUT_LINE('Customer Name    : ' || rec.Name);
        DBMS_OUTPUT.PUT_LINE('Transaction ID   : ' || rec.TransactionID);
        DBMS_OUTPUT.PUT_LINE('Transaction Date : ' || TO_CHAR(rec.TransactionDate,'DD-MON-YYYY'));
        DBMS_OUTPUT.PUT_LINE('Transaction Type : ' || rec.TransactionType);
        DBMS_OUTPUT.PUT_LINE('Amount           : ' || rec.Amount);
        DBMS_OUTPUT.PUT_LINE('------------------------------------');

    END LOOP;

END;
/