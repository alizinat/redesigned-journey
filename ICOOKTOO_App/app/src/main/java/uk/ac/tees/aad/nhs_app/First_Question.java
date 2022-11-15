package uk.ac.tees.aad.icooktoo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class First_Question extends AppCompatActivity {

    CheckBox Option1, Option2,Option3,Option4,Option5;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        Option1 = findViewById(R.id.checkBox);
        Option2 = findViewById(R.id.checkBox3);
        Option3 = findViewById(R.id.checkBox4);
        Option4 = findViewById(R.id.checkBox5);
        Option5 = findViewById(R.id.checkBox6);
        button = findViewById(R.id.Next);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(First_Question.this, SecondQuestion.class);
                startActivity(intent);
            }
        });



    }

    public void onCheckboxClicked(View view)
    {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId())
        {

            case R.id.checkBox:
                if(checked)
                {
                    Toast.makeText(First_Question.this,"Clicekd 1",Toast.LENGTH_LONG).show();
                    button.setVisibility(View.VISIBLE);
                    Option2.setChecked(false);
                    Option3.setChecked(false);
                    Option4.setChecked(false);
                    Option5.setChecked(false);
                }
                else
                    {
                        Toast.makeText(First_Question.this,"Not Checked",Toast.LENGTH_LONG).show();
                    }
                break;

            case R.id.checkBox3:
                if(checked)
                {
                    Toast.makeText(First_Question.this,"Clicekd 1",Toast.LENGTH_LONG).show();
                    button.setVisibility(View.VISIBLE);
                    Option1.setChecked(false);
                    Option3.setChecked(false);
                    Option4.setChecked(false);
                    Option5.setChecked(false);
                }
                else
                {
                    Toast.makeText(First_Question.this,"Not Checked",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.checkBox4:
                if(checked)
                {
                    button.setVisibility(View.VISIBLE);
                    Option1.setChecked(false);
                    Option2.setChecked(false);
                    Option4.setChecked(false);
                    Option5.setChecked(false);
                }
                else{
                    Toast.makeText(First_Question.this,"Not Checked",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.checkBox5:
                if(checked)
                {
                    button.setVisibility(View.VISIBLE);
                    Option1.setChecked(false);
                    Option2.setChecked(false);
                    Option3.setChecked(false);
                    Option5.setChecked(false);
                }
                else{
                    Toast.makeText(First_Question.this,"Not Checked",Toast.LENGTH_LONG).show();
                }
                break;
            case R.id.checkBox6:
                if(checked)
                {
                    button.setVisibility(View.VISIBLE);
                    Option1.setChecked(false);
                    Option2.setChecked(false);
                    Option3.setChecked(false);
                    Option4.setChecked(false);
                }
                else{
                    Toast.makeText(First_Question.this,"Not Checked",Toast.LENGTH_LONG).show();
                }
                break;

        }


    }



}