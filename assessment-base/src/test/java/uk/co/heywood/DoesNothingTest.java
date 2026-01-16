package uk.co.heywood;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DoesNothingTest
{
    @Test
    public void testDoesNothing()
    {
        DoesNothing doesNothing = new DoesNothing();
        assertEquals( "Did Nothing", doesNothing.doNothing() );
    }
}