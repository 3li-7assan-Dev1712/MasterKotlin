package app.netlify.dev_ali_hassan.masterkotlin.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val drawableResourceId: Int
)