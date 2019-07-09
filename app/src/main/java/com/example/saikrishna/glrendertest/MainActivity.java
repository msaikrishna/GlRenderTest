package com.example.saikrishna.glrendertest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.saikrishna.glrendertest.react.VideoRenderer;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.et);
        Button button = findViewById(R.id.button);
//        String et = "#extension GL_OES_EGL_image_external : require\n"
//                + "precision mediump float;\n"
//                + "varying vec2 vTextureCoord;\n"
//                + "uniform samplerExternalOES sTexture;\n"
//                + "varying mediump float text_alpha_out;\n"
//                + "void main() {\n"
//                +"  float pixelSat, secondaryComponents;\n"
//                + " vec4 sourcePixel = texture2D(sTexture, vTextureCoord);\n"
//                +"  float fmin = min(min(sourcePixel.r, sourcePixel.g), sourcePixel.b);\n"
//                +"  float fmax = max(max(sourcePixel.r, sourcePixel.g), sourcePixel.b);\n"
//                +"  vec4 screen = vec4(0.0,1.0,0.0,1.0);\n"
//                +"	float fmax1 = max(max(screen.r, screen.g), screen.b);\n"
//                +"  vec3 screenPrimary = step(fmax1, screen.rgb);\n"
//                +"  vec3 pixelPrimary = step(fmax, sourcePixel.rgb);\n"
//                +"  secondaryComponents = dot(1.0 - pixelPrimary, sourcePixel.rgb);\n"
//                +"  float screenSat = fmax - mix(secondaryComponents - fmin, secondaryComponents / 2.0, 1.0);\n"
//                +"  pixelSat = fmax - mix(secondaryComponents - fmin, secondaryComponents / 2.0, 1.0);\n"
//                +"  float diffPrimary = dot(abs(pixelPrimary - screenPrimary), vec3(1.0));\n"
//                +"  float solid = step(1.0, step(pixelSat, 0.1) + step(fmax, 0.1) + diffPrimary);\n"
//                +"  float alpha = max(0.0, 1.0 - pixelSat / screenSat);\n"
//                +"  alpha = smoothstep(0.0, 1.0, alpha);\n"
//                +"  vec4 semiTransparentPixel = vec4((sourcePixel.rgb - (1.0 - alpha) * screen.rgb * 1.0) / max(0.00001, alpha), alpha);\n"
//                +"  vec4 pixel = vec4(sourcePixel.r, sourcePixel.g, sourcePixel.b, solid);\n"
//                +"   gl_FragColor = vec4(sourcePixel.r, sourcePixel.g, sourcePixel.b,1.0);\n"
//                +"if(solid == 0.0)\n"
//                +"{\n"
//                +"gl_FragColor=vec4(sourcePixel.r, sourcePixel.g, sourcePixel.b, 0.0);\n"
//                +"}\n"
//                + "}\n";
       // editText.setText(et);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //VideoRenderer.alphaShader = editText.getText().toString();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
    }
}
