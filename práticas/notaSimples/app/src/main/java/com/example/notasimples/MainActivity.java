package com.example.notasimples;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {

    EditText editTextNote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNote = findViewById(R.id.editTextNote);
        Button buttonSave = findViewById(R.id.buttonSave);

        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noteContent = editTextNote.getText().toString();
                saveNoteToFile(noteContent);
            }
        });
    }

    private void saveNoteToFile(String noteContent) {
        try {
            FileOutputStream fileOutputStream = openFileOutput("note.txt", MODE_PRIVATE);
            fileOutputStream.write(noteContent.getBytes());
            fileOutputStream.close();
            Toast.makeText(this, "Nota salva com sucesso!", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(this, "Erro ao salvar a nota.", Toast.LENGTH_SHORT).show();
        }
    }
}
