
package com.example.android.datafrominternet;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.datafrominternet.R;

public class MainActivity extends AppCompatActivity {

    // TODO (26) Create an EditText variable called mSearchBoxEditText
    private EditText mSearchBoxEditText;

    // TODO (27) Create a TextView variable called mUrlDisplayTextView
    private TextView mUrlDisplayTextView;

    // TODO (28) Create a TextView variable called mSearchResultsTextView
    private TextView mSearchResultsTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO (29) Use findViewById to get a reference to mSearchBoxEditText
        mSearchBoxEditText = (EditText) findViewById(R.id.et_search_box);

        // TODO (30) Use findViewById to get a reference to mUrlDisplayTextView
        mUrlDisplayTextView =(TextView) findViewById(R.id.tv_url_display);

        // TODO (31) Use findViewById to get a reference to mSearchResultsTextView
        mSearchResultsTextView =(TextView) findViewById(R.id.tv_github_search_results_json);
    }
}
