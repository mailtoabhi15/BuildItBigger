package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.util.Pair;

import org.junit.Test;


import java.util.concurrent.TimeUnit;

import static android.support.test.InstrumentationRegistry.getContext;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;
import static org.junit.Assert.*;

/**
 * Created by abhishek.dixit on 11/21/2016.
 */
public class JokeTest {
    @Test
    public void testEmptyJoke() throws Exception  {

        try {
            String joke = new EndpointsAsyncTask().execute(new Pair<Context, String>(getContext(), "Joking!!"))
                            .get(20, TimeUnit.SECONDS);
            assert joke != null;
            assertTrue("Empty String", joke.length()>0);
        }catch (Exception e){
            fail("Time Out");
            e.printStackTrace();
        }
    }

}