package com.example.learnandquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Learning extends AppCompatActivity implements View.OnClickListener {
    Button a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        a = findViewById(R.id.A);
        a.setOnClickListener(this);
        b = findViewById(R.id.B);
        b.setOnClickListener(this);
        c = findViewById(R.id.C);
        c.setOnClickListener(this);
        d = findViewById(R.id.D);
        d.setOnClickListener(this);
        e = findViewById(R.id.E);
        e.setOnClickListener(this);
        f = findViewById(R.id.F);
        f.setOnClickListener(this);
        g = findViewById(R.id.G);
        g.setOnClickListener(this);
        h = findViewById(R.id.H);
        h.setOnClickListener(this);
        i = findViewById(R.id.I);
        i.setOnClickListener(this);
        j = findViewById(R.id.J);
        j.setOnClickListener(this);
        k = findViewById(R.id.K);
        k.setOnClickListener(this);
        l = findViewById(R.id.L);
        l.setOnClickListener(this);
        m = findViewById(R.id.M);
        m.setOnClickListener(this);
        n = findViewById(R.id.N);
        n.setOnClickListener(this);
        o = findViewById(R.id.O);
        o.setOnClickListener(this);
        p = findViewById(R.id.P);
        p.setOnClickListener(this);
        q = findViewById(R.id.Q);
        q.setOnClickListener(this);
        r = findViewById(R.id.R);
        r.setOnClickListener(this);
        s = findViewById(R.id.S);
        s.setOnClickListener(this);
        t = findViewById(R.id.T);
        t.setOnClickListener(this);
        u = findViewById(R.id.U);
        u.setOnClickListener(this);
        v = findViewById(R.id.V);
        v.setOnClickListener(this);
        w = findViewById(R.id.W);
        w.setOnClickListener(this);
        x = findViewById(R.id.X);
        x.setOnClickListener(this);
        y = findViewById(R.id.Y);
        y.setOnClickListener(this);
        z = findViewById(R.id.Z);
        z.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {
            case R.id.A:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "A");
                startActivity(intent);
                break;
            case R.id.B:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "B");
                startActivity(intent);
                break;
            case R.id.C:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "C");
                startActivity(intent);
                break;
            case R.id.D:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "D");
                startActivity(intent);
                break;
            case R.id.E:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "E");
                startActivity(intent);
                break;
            case R.id.F:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "F");
                startActivity(intent);
                break;
            case R.id.G:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "G");
                startActivity(intent);
                break;
            case R.id.H:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "H");
                startActivity(intent);
                break;
            case R.id.I:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "I");
                startActivity(intent);
                break;
            case R.id.J:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "J");
                startActivity(intent);
                break;
            case R.id.K:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "K");
                startActivity(intent);
                break;
            case R.id.L:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "L");
                startActivity(intent);
                break;
            case R.id.M:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "M");
                startActivity(intent);
                break;
            case R.id.N:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "N");
                startActivity(intent);
                break;
            case R.id.O:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "O");
                startActivity(intent);
                break;
            case R.id.P:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "P");
                startActivity(intent);
                break;
            case R.id.Q:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "Q");
                startActivity(intent);
                break;
            case R.id.R:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "R");
                startActivity(intent);
                break;
            case R.id.S:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "S");
                startActivity(intent);
                break;
            case R.id.T:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "T");
                startActivity(intent);
                break;
            case R.id.U:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "U");
                startActivity(intent);
                break;
            case R.id.V:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "V");
                startActivity(intent);
                break;
            case R.id.W:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "W");
                startActivity(intent);
                break;
            case R.id.X:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "X");
                startActivity(intent);
                break;
            case R.id.Y:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "Y");
                startActivity(intent);
                break;
            case R.id.Z:
                intent = new Intent(Learning.this, learning_images.class);
                intent.putExtra("btnID", "Z");
                startActivity(intent);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v.getId());
        }
    }
}