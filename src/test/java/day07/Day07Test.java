package day07;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class Day07Test {
  private Day07 day = new Day07();

  @Test
  public void testPartOneBasic() throws FileNotFoundException {
    File file = new File(getClass().getClassLoader().getResource("Day07/basic.txt").getFile());
    assertEquals(54321, day.solvePartOne(file));
  }

  @Test
  public void testPartOneInput() throws FileNotFoundException {
    File file = new File(getClass().getClassLoader().getResource("Day07/input.txt").getFile());
    assertEquals(273814, day.solvePartOne(file));
  }

}