package com.example.androidpuzzlegame;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public class PuzzlePiece extends AppCompatActivity {
    public int xCoord;
    public int yCoord;
    public int pieceWidth;
    public int pieceHeight;
    public boolean canMove = true;

    public PuzzlePiece(Context context) {
        super(context);

    }
}
