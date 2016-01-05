import org.junit.*;
import static org.junit.Assert.*;

public class QueenAttackTest {
  @Test
  public void queenAttack_isFalseIftheCoordinatesAreNotHorizontalVeritcalOrDiagonalInLine_false() {
    QueenAttack attack = new QueenAttack();
    assertEquals(false, attack.checkQueensAttack([1, 1], [2, 3]));
  }

}
