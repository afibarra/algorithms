package me.afibarra;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.given;

/**
 * Unit test for the App class.
 */
@RunWith(MockitoJUnitRunner.class)
public class AppTest {

    /**
     * Insert here your mocks
     */
    @Mock
    private List mockList;

    /**
     * Sample test with given-when-then structure using MockitoBDD and AssertJ
     */
    @Test
    public void listDoesWorkWithMocks() {
        given(mockList.size()).willReturn(10);

        final int sizeOfTheList = mockList.size();

        assertThat(sizeOfTheList).isEqualTo(10);
    }
}
