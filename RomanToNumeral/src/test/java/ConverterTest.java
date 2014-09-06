import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConverterTest {

  private Converter converter;

  @Before
  public void setUp() {
    converter = new Converter();
  }

  @Test
  public void should_return_ten_when_converting_X() {
    // Given
    String romanNumber = "X";

    // When
    int result = converter.convert(romanNumber);

    // Then
    assertThat(result).isEqualTo(10);
  }

  @Test
  public void should_return_one_when_converting_I() {
    //Given
    String romanNumber = "I";

    //When
    int result = converter.convert(romanNumber);

    //Then
    assertThat(result).isEqualTo(1);
  }

  @Test
  public void should_return_eleven_when_converting_XI() {
    //Given
    String romanNumber = "XI";

    //When
    int result = converter.convert(romanNumber);

    //Then
    assertThat(result).isEqualTo(11);
  }


  @Test
  public void should_return_five_when_converting_V() {
    //Given
    String romanNumber = "V";

    //When
    int result = converter.convert(romanNumber);

    //Then
    assertThat(result).isEqualTo(5);
  }

  @Test(expected = IllegalArgumentException.class)
  public void should_fail_when_invalid_roman_number() {
    // Given
    String romanNumber = "XAX";

    // When
    int result = converter.convert(romanNumber);

    // Then
    // Throws IllegalArgumentException
  }

  @Test
  public void should_return_fifty_when_converting_L() {
    //Given
    String romanNumber = "L";

    //When
    int result = converter.convert(romanNumber);

    //Then
    assertThat(result).isEqualTo(50);
  }

  @Test
  public void should_return_four_when_converting_IV() {
    //Given
    String romanNumber = "IV";

    //When
    int result = converter.convert(romanNumber);

    //Then
    assertThat(result).isEqualTo(4);
  }

  @Test(expected = IllegalArgumentException.class)
  public void should_fail_when_invalid_roman_number_with_correct_numerals() {
    // Given
    String romanNumber = "IIIX";

    // When
    int result = converter.convert(romanNumber);

    // Then
    // Throws IllegalArgumentException
  }

  @Test
  public void should_return_four_hundred_ninetynine_when_CDXCIX(){
    //Given
    String romanNumber = "CDXCIX";

    //When
    int result = converter.convert(romanNumber);

    //Then
    assertThat(result).isEqualTo(499);
  }

  @Test(expected = IllegalArgumentException.class)
  public void should_fail_when_IIII(){
    //Given
    String romanNumber = "IIII";

    //When
    int result = converter.convert(romanNumber);
  }
}
