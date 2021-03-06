package com.daimajia.slider.library.Transformers;

import android.view.View;

public class RotateUpTransformer extends BaseTransformer {

    private static final float ROT_MOD = -15f;

    @Override
    protected void onTransform(View view, float position) {
        final float width = view.getWidth();
        final float rotation = ROT_MOD * position;

        view.setPivotX(width * 0.5f);
        view.setPivotY(0f);
        View.TRANSLATION_X.set(view, 0f);
        View.ROTATION.set(view, rotation);
    }

    @Override
    protected boolean isPagingEnabled() {
        return true;
    }

}
