package urgroup.in.dbmssqlcompleteguide;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Quiz_Game extends AppCompatActivity {
    Button choice, choice1, choice2, choice3;
    TextView Score, Question;
    private Question_Answer question_answer = new Question_Answer();
    private int Tscore = 0;
    private String mAnswer;
    private int mQuestionLength = question_answer.mQuestion.length;
    Random random;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz__game);

        random = new Random();


        choice = (Button) findViewById(R.id.button);
        choice1 = (Button) findViewById(R.id.button2);
        choice2 = (Button) findViewById(R.id.button3);
        choice3 = (Button) findViewById(R.id.button4);
        Score = (TextView) findViewById(R.id.textView);
        Question = (TextView) findViewById(R.id.textView2);
        Score.setText(String.valueOf("Score :- " + Tscore));

        UpdateQuestion(random.nextInt(mQuestionLength));

        choice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mAnswer == choice.getText()) {
                    Tscore++;
                    Score.setText(String.valueOf("Score :- " + Tscore));
                    UpdateQuestion(random.nextInt(mQuestionLength));
                } else {
                    gameOver();
                }
            }
        });

        choice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mAnswer == choice1.getText()) {
                    Tscore++;
                    Score.setText(String.valueOf("Score :- " + Tscore));
                    UpdateQuestion(random.nextInt(mQuestionLength));
                } else {
                    gameOver();
                }

            }
        });

        choice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mAnswer == choice2.getText()) {
                    Tscore++;
                    Score.setText(String.valueOf("Score :- " + Tscore));
                    UpdateQuestion(random.nextInt(mQuestionLength));
                } else {
                    gameOver();
                }

            }
        });

        choice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mAnswer == choice3.getText()) {
                    Tscore++;
                    Score.setText(String.valueOf("Score :- " + Tscore));
                    UpdateQuestion(random.nextInt(mQuestionLength));
                } else {
                    gameOver();
                }

            }
        });


    }

    private void gameOver() {
        AlertDialog.Builder Alert =new  AlertDialog.Builder(this);
        Alert.setMessage("Quiz Over Your score is " +Tscore ).setCancelable(false)
                .setPositiveButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                        Intent intent = new Intent(Quiz_Game.this , MainActivity.class);
                        startActivity(intent);
                    }
                })

                .setNegativeButton("New Quiz", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                        Intent intent = new Intent(Quiz_Game.this , Quiz_Game.class);
                        startActivity(intent);

                    }
                });

        AlertDialog alt = Alert.create();
        alt.show();
    }


    private void UpdateQuestion(int i) {
        Question.setText(question_answer.getQuestion(i));
        choice.setText(question_answer.getChoice1(i));
        choice1.setText(question_answer.getChoice2(i));
        choice2.setText(question_answer.getChoice3(i));
        choice3.setText(question_answer.getChoice4(i));
        mAnswer = question_answer.getAnswer(i);
    }
}
