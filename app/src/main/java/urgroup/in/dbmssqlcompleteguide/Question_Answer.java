package urgroup.in.dbmssqlcompleteguide;

/**
 * Created by ujjwal on 2/10/2018.
 */

public class Question_Answer {
    public String mQuestion[] =

            {
                    "DBMS is a collection of ………… that enables user to create and maintain a database.",
                    "In a relational schema, each tuple is divided into fields called",
                    "In an ER model, …………… is described in the database by storing its data.",
                    "DFD stands for",
                    "A top-to-bottom relationship among the items in a database is established by a",
                    "………. command can be used to modify a column in a table",
                    "Data model that preceded relational data model is known to be",
                    "A DDL operation referring to some object is protected by",
                    "A collection of tables to represent data and relationship among data is represented through model",
            };
    private String mChoice[][] = {
            {"Keys", "Translators", "Program", "Language Activity"},
            {"Relations", "Domains", "Queries", "All of the above"},
            {"Entity", "Attribute", "Relationship", "Notation"},
            {"Data Flow Document", "Data File Diagram", "Data Flow Diagram", "Non of the above"},
            {"Hierarchical schema", "Network schema", "Relational Schema", "All of the above"},
            {"alter", "update", "set", "create"},
            {"Network data model", "Hierarchical data model", "Structured data model", "Both A and B",},
            {"Encapsulation", "Encryption", "Locking", "Views log"},
            {"ER data model", "Relational model", "Semistructured model", "Object based model"},
    };
    private String mAnswer[] = {"Program", "Domains", "Entity", "Data Flow Diagram", "Hierarchical schema", "alter", "Both A and B", "Locking", "Relational model"};

    public String getQuestion(int a) {
        String Question = mQuestion[a];
        return Question;
    }

    public String getChoice1(int a) {
        String Choice = mChoice[a][0];
        return Choice;
    }

    public String getChoice2(int a) {
        String Choice = mChoice[a][1];
        return Choice;
    }

    public String getChoice3(int a) {
        String Choice = mChoice[a][2];
        return Choice;
    }

    public String getChoice4(int a) {
        String Choice = mChoice[a][3];
        return Choice;
    }

    public String getAnswer(int a) {
        String Answer = mAnswer[a];
        return Answer;
    }
}
