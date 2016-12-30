package com.antoniooreany.p0111_resvalues;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private static final int MARGIN_OF_48_DP_ICON = 0;
    private static final int MARGIN_OF_18_DP_ICON = 60;
    private static final int BLACK_48DP = 1;
    private static final int GREY_48DP = 2;
    private static final int BLACK_18DP = 3;
    private static final int GREY_18DP = 4;
    private static int imageViewIconType = BLACK_48DP;
    private ImageView imageView;
    private int imageViewIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (imageViewIconType) {
                    case BLACK_48DP:
                        imageViewIcon = R.drawable.ic_android_grey600_48dp;
                        imageViewIconType = GREY_48DP;
                        int margin = MARGIN_OF_48_DP_ICON;
                        setImageViewMargins(imageView, margin, margin, margin, margin);
                        break;
                    case GREY_48DP:
                        imageViewIcon = R.drawable.ic_android_black_18dp;
                        imageViewIconType = BLACK_18DP;
                        margin = MARGIN_OF_18_DP_ICON;
                        setImageViewMargins(imageView, margin, margin, margin, margin);
                        break;
                    case BLACK_18DP:
                        imageViewIcon = R.drawable.ic_android_grey600_18dp;
                        imageViewIconType = GREY_18DP;
                        margin = MARGIN_OF_18_DP_ICON;
                        setImageViewMargins(imageView, margin, margin, margin, margin);
                        break;
                    case GREY_18DP:
                        imageViewIcon = R.drawable.ic_android_black_48dp;
                        imageViewIconType = BLACK_48DP;
                        margin = MARGIN_OF_48_DP_ICON;
                        setImageViewMargins(imageView, margin, margin, margin, margin);
                        break;
                }
                Resources resources = getResources();
                Drawable drawable = resources.getDrawable(imageViewIcon);
                imageView.setImageDrawable(drawable);
            }
        };
        imageView.setOnClickListener(onClickListener);
    }

    private void setImageViewMargins(ImageView imageView, int left, int top, int right, int bottom) {
        ViewGroup.LayoutParams imageViewLayoutParams = imageView.getLayoutParams();
        if (imageViewLayoutParams instanceof ViewGroup.MarginLayoutParams) {
            final ViewGroup.MarginLayoutParams marginLayoutParams
                    = (ViewGroup.MarginLayoutParams) imageViewLayoutParams;
            marginLayoutParams.setMargins(left, top, right, bottom);
        }
    }
}
