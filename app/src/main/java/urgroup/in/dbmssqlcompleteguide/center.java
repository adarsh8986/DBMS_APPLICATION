package urgroup.in.dbmssqlcompleteguide;


import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class center extends Fragment implements AdapterView.OnItemSelectedListener {
    Button more, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18;

    public center() {
    }

    Activity activity = getActivity();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_center, container, false);
        more = (Button) view.findViewById(R.id.button);
        btn1 = (Button) view.findViewById(R.id.button1);
        btn2 = (Button) view.findViewById(R.id.button2);
        btn3 = (Button) view.findViewById(R.id.button3);
        btn4 = (Button) view.findViewById(R.id.button4);
        btn5 = (Button) view.findViewById(R.id.button5);
        btn6 = (Button) view.findViewById(R.id.button6);
        btn7 = (Button) view.findViewById(R.id.button7);
        btn8 = (Button) view.findViewById(R.id.button8);
        btn9 = (Button) view.findViewById(R.id.button9);
        btn10 = (Button) view.findViewById(R.id.button10);
        btn11 = (Button) view.findViewById(R.id.button11);
        btn12 = (Button) view.findViewById(R.id.button12);
        btn13 = (Button) view.findViewById(R.id.button13);
        btn14 = (Button) view.findViewById(R.id.button14);
        btn15 = (Button) view.findViewById(R.id.button15);
        btn16 = (Button) view.findViewById(R.id.button16);
        btn17 = (Button) view.findViewById(R.id.button17);
        btn18 = (Button) view.findViewById(R.id.button18);


        more.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("CREATE DATABASE");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Syntax:-\nCREATE DATABASE databasename;\n\n\n Example:-\nCREATE DATABASE testDB;");
                alertDialog.show();
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("CREATE TABLE");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Syntax:-\nCREATE TABLE table_name (\n" +
                        "    column1 datatype,\n" +
                        "    column2 datatype,\n" +
                        "    column3 datatype,\n" +
                        "   ....\n" +
                        ");\n\n\n Example:-\nCREATE TABLE Persons (\n" +
                        "    PersonID int,\n" +
                        "    LastName varchar(255),\n" +
                        "    FirstName varchar(255),\n" +
                        "    Address varchar(255),\n" +
                        "    City varchar(255) \n" +
                        ");");
                alertDialog.show();
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("DROP DATABASE");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Syntax:-\nDROP DATABASE databasename;\n\n\n Example:-\nDROP DATABASE testDB;");
                alertDialog.show();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("DROP TABLE");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Syntax:-\nDROP TABLE table_name;\n\n\n Example:-\nDROP TABLE Shippers;");
                alertDialog.show();
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("ALTER TABLE");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Syntax:-\nALTER TABLE table_name\n" +
                        "ADD column_name datatype;\n\n\n Example:-\nALTER TABLE Persons\n" +
                        "ADD DateOfBirth date;\n\n\nNote-If want to drop column then replace DROP in place of ADD  ");
                alertDialog.show();
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("CREATE CONSTRAINTS");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Syntax:-\nCREATE TABLE table_name (\n" +
                        "    column1 datatype constraint,\n" +
                        "    column2 datatype constraint,\n" +
                        "    column3 datatype constraint,\n" +
                        "    ....\n" +
                        ");\n\n\n Example:-\nCREATE TABLE dim1 (  c1 INTEGER CONSTRAINT dim1PK PRIMARY KEY,\n" +
                        "  c2 INTEGER\n" +
                        ");");
                alertDialog.show();
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("NOT NULL CONSTRAINTS");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Example:-\nCREATE TABLE Persons (\n" +
                        "    ID int NOT NULL,\n" +
                        "    LastName varchar(255) NOT NULL,\n" +
                        "    FirstName varchar(255) NOT NULL,\n" +
                        "    Age int\n" +
                        ");");
                alertDialog.show();
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("UNIQUE CONSTRAINT");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Oracle/SQL Server:-\nCREATE TABLE Persons (\n" +
                        "    ID int NOT NULL UNIQUE,\n" +
                        "    LastName varchar(255) NOT NULL,\n" +
                        "    FirstName varchar(255),\n" +
                        "    Age int\n" +
                        ");\n\n\n Mysql:-\nCREATE TABLE Persons (\n" +
                        "    ID int NOT NULL,\n" +
                        "    LastName varchar(255) NOT NULL,\n" +
                        "    FirstName varchar(255),\n" +
                        "    Age int,\n" +
                        "    UNIQUE (ID)\n" +
                        ");");
                alertDialog.show();
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("PRIMARY KEY");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Mysql:-\nCREATE TABLE Persons (\n" +
                        "    ID int NOT NULL,\n" +
                        "    LastName varchar(255) NOT NULL,\n" +
                        "    FirstName varchar(255),\n" +
                        "    Age int,\n" +
                        "    PRIMARY KEY (ID)\n" +
                        ");\n\n\n Oracle/SQL Server :-\nCREATE TABLE Persons (\n" +
                        "    ID int NOT NULL PRIMARY KEY,\n" +
                        "    LastName varchar(255) NOT NULL,\n" +
                        "    FirstName varchar(255),\n" +
                        "    Age int\n" +
                        ");");
                alertDialog.show();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("FOREIGN KEY");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Mysql:-\nCREATE TABLE Orders (\n" +
                        "    OrderID int NOT NULL,\n" +
                        "    OrderNumber int NOT NULL,\n" +
                        "    PersonID int,\n" +
                        "    PRIMARY KEY (OrderID),\n" +
                        "    FOREIGN KEY (PersonID) REFERENCES Persons(PersonID)\n" +
                        ");\n\n\n Oracle/SQL Server:-\nCREATE TABLE Orders (\n" +
                        "    OrderID int NOT NULL PRIMARY KEY,\n" +
                        "    OrderNumber int NOT NULL,\n" +
                        "    PersonID int FOREIGN KEY REFERENCES Persons(PersonID)\n" +
                        ");");
                alertDialog.show();
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("CHECK on CREATE TABLE");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Mysql:-\nCREATE TABLE Persons (\n" +
                        "    ID int NOT NULL,\n" +
                        "    LastName varchar(255) NOT NULL,\n" +
                        "    FirstName varchar(255),\n" +
                        "    Age int,\n" +
                        "    CHECK (Age>=18)\n" +
                        ");\n\n\n Oracle/SQL Server:-\nCREATE TABLE Persons (\n" +
                        "    ID int NOT NULL,\n" +
                        "    LastName varchar(255) NOT NULL,\n" +
                        "    FirstName varchar(255),\n" +
                        "    Age int CHECK (Age>=18)\n" +
                        ");");
                alertDialog.show();
            }
        });


        btn11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle(" AUTO INCREMENT");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Example1:-\nCREATE TABLE Persons (\n" +
                        "    ID int NOT NULL AUTO_INCREMENT,\n" +
                        "    LastName varchar(255) NOT NULL,\n" +
                        "    FirstName varchar(255),\n" +
                        "    Age int,\n" +
                        "    PRIMARY KEY (ID)\n" +
                        ");\n\n\n Example2:-\nALTER TABLE Persons AUTO_INCREMENT=100;");
                alertDialog.show();
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("DEFAULT on CREATE TABLE");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Oracle/SQL Server:-\nCREATE TABLE Persons (\n" +
                        "    ID int NOT NULL,\n" +
                        "    LastName varchar(255) NOT NULL,\n" +
                        "    FirstName varchar(255),\n" +
                        "    Age int,\n" +
                        "    City varchar(255) DEFAULT 'Sandnes'\n" +
                        ");\n\n\n Mysql:-\nALTER TABLE Persons\n" +
                        "ALTER City SET DEFAULT 'Sandnes';");
                alertDialog.show();
            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("SELECT Statement");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Syntax:-\nSELECT column1, column2, ...\n" +
                        "FROM table_name;\n\n\n Example:-\nSELECT * FROM table_name;");
                alertDialog.show();
            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("WHERE Clause");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Syntax:-\nSELECT column1, column2, ...\n" +
                        "FROM table_name\n" +
                        "WHERE condition;\n\n\n Example:-\nSELECT * FROM Customers\n" +
                        "WHERE Country='Mexico';");
                alertDialog.show();
            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("INSERT INTO");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Syntax:-\nINSERT INTO table_name (column1, column2, column3, ...)\n" +
                        "VALUES (value1, value2, value3, ...);\n\n\n Example:-\nINSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)\n" +
                        "VALUES ('Cardinal', 'Tom B. Erichsen', 'Skagen 21', 'Stavanger', '4006', 'Norway');");
                alertDialog.show();
            }
        });


        btn16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("SELECT DISTINCT");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Syntax:-\nSELECT DISTINCT column1, column2, ...\n" +
                        "FROM table_name;\n\n\n Example:-\nSELECT Country FROM Customers;");
                alertDialog.show();
            }
        });
        btn17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("UPDATE Statement");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Syntax:-\nUPDATE table_name\n" +
                        "SET column1 = value1, column2 = value2, ...\n" +
                        "WHERE condition;\n\n\n Example:-\nUPDATE Customers\n" +
                        "SET ContactName = 'Alfred Schmidt', City= 'Frankfurt'\n" +
                        "WHERE CustomerID = 1;");
                alertDialog.show();
            }
        });
        btn18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(
                        getActivity()).create();
                alertDialog.setTitle("DELETE Statement");
                alertDialog.setIcon(R.drawable.jv);
                alertDialog.setMessage("Syntax:-\nDELETE FROM table_name\n" +
                        "WHERE condition;\n\n\n Example:-\nDELETE FROM Customers\n" +
                        "WHERE CustomerName='Alfreds Futterkiste';");
                alertDialog.show();
            }
        });


        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
