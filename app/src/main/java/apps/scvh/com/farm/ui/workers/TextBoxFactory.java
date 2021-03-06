package apps.scvh.com.farm.ui.workers;


import android.content.Context;
import android.view.ViewGroup;
import android.widget.EditText;

/**
 * RUS Простенький метод который служит фабрикой для эдиттекстов
 * ENG simple factory for making edittext views
 */
public class TextBoxFactory {

    private Context context;

    public TextBoxFactory(Context context) {
        this.context = context;
    }

    /**
     * @param stringId the string
     * @return the edit text with hint
     */
    public EditText createTextBox(int stringId) {
        EditText editText = new EditText(context);
        editText.setHint(stringId);
        editText.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT));
        return editText;
    }
}
