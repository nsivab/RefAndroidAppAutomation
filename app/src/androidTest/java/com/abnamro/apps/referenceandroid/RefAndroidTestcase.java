package com.abnamro.apps.referenceandroid;
import androidx.test.ext.junit.rules.*;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import static androidx.test.espresso.Espresso.*;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;

@RunWith(AndroidJUnit4.class)
@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RefAndroidTestcase {
    private String VERIFY_TITLE = "Hello World!";
    @Rule
    public ActivityScenarioRule<MainActivity> mainActivityRule = new ActivityScenarioRule<>
            (MainActivity.class);

//    @Before
//    public void setUp() throws Exception {
//        //Before Test case execution When conditions need to be ran
//    }

    @Test
    public void verifyToolbar() {
        onView(withId(R.id.toolbar)).check(matches(isDisplayed()));
    }


    @Test
    public void verifyHelloWorld() {
        onView(withText(VERIFY_TITLE)).check(matches(isDisplayed()));

    }

    @Test
    public void verifyFloatingActionButton() {
        onView(withId(R.id.fab)).check(matches(isDisplayed()));
        onView(withId(R.id.fab)).perform(click());

    }

    @Test
    public void verifyFragmentLayout() {
        onView(withId(R.id.fragment)).check(matches(isDisplayed()));

    }

//    @After
//    public void tearDown() throws Exception {
//        //After Test case Execution When pages need to be closed
//    }
}

