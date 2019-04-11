package com.e.stack;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button pushButton;
    private Button popButton;
    private EditText pushField;
    private TextView stackView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final CustomStack st = new CustomStack();

        pushButton = findViewById(R.id.push_button);
        popButton = findViewById(R.id.pop_button);
        pushField = findViewById(R.id.push_field);
        stackView = findViewById(R.id.stack_view);

        View.OnClickListener pushClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String newElement = pushField.getText().toString();
                st.push(newElement);
                stackView.setText("");
                stackView.setText(st.toString());
            }
        };
        pushButton.setOnClickListener(pushClickListener);

        View.OnClickListener popClickListener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                st.pop();

                stackView.setText("");
                stackView.setText(st.toString());
            }
        };
        popButton.setOnClickListener((popClickListener));
    }
}
