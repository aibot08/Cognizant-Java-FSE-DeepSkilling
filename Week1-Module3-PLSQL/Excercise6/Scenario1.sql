SET SERVEROUTPUT ON;

DECLARE
    CURSOR GenerateMonthlyStatements IS
    SELECT CustomerID, AccountID, Balance
    FROM Accounts;

    v_customer Accounts.CustomerID%TYPE;
    v_account Accounts.AccountID%TYPE;
    v_balance Accounts.Balance%TYPE;
BEGIN
    OPEN GenerateMonthlyStatements;

    LOOP
        FETCH GenerateMonthlyStatements
        INTO v_customer, v_account, v_balance;

        EXIT WHEN GenerateMonthlyStatements%NOTFOUND;

        DBMS_OUTPUT.PUT_LINE('Customer ID: '||v_customer||
                             ' Account: '||v_account||
                             ' Balance: '||v_balance);
    END LOOP;

    CLOSE GenerateMonthlyStatements;
END;
/
