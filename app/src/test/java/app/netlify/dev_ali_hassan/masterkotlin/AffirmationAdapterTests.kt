package app.netlify.dev_ali_hassan.masterkotlin

import android.content.Context
import app.netlify.dev_ali_hassan.masterkotlin.data.Affirmation
import app.netlify.dev_ali_hassan.masterkotlin.data.AffirmationAdapter
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationAdapterTests {
    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        val data = listOf(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2)
        )
        val adapter = AffirmationAdapter(data)
        assertEquals("Affirmation adapter list size is not equal the passed list",
        data.size, adapter.itemCount)
    }
}