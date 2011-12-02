package com.jetbrains.python;

import com.intellij.openapi.actionSystem.IdeActions;
import com.intellij.openapi.fileEditor.FileDocumentManager;
import com.jetbrains.python.fixtures.PyTestCase;

/**
 * @author Alexey.Ivanov
 */
public class PyStatementMoverTest extends PyTestCase {
  private void doTest() {
    final String testName = getTestName(true);
    myFixture.configureByFile("mover/" + testName + ".py");
    myFixture.performEditorAction(IdeActions.ACTION_MOVE_STATEMENT_UP_ACTION);
    myFixture.checkResultByFile("mover/" + testName + "_afterUp.py", true);

    FileDocumentManager.getInstance().reloadFromDisk(myFixture.getDocument(myFixture.getFile()));
    myFixture.configureByFile("mover/" + getTestName(true) + ".py");
    myFixture.performEditorAction(IdeActions.ACTION_MOVE_STATEMENT_DOWN_ACTION);
    myFixture.checkResultByFile("mover/" + testName + "_afterDown.py", true);
  }

  public void testSimple() {
    doTest();
  }

  public void testInnerIf() {
    doTest();
  }

  public void testMoveDownOut() {
    doTest();
  }

  public void testOneStatementInFunction() {
    doTest();
  }

  public void testOutsideStatement() {
    doTest();
  }

  public void testInsideStatement() {
    doTest();
  }

  public void testFunctions() {
    doTest();
  }

  public void testBetweenStatementParts() {
    doTest();
  }

  public void testMoveStatement() {
    doTest();
  }

  public void testDoubleIf() {
    doTest();
  }

  public void testOneStatementInClass() {
    doTest();
  }

  public void testMoveOut() {
    doTest();
  }

  public void testSimpleBlankLines() {
    doTest();
  }

  public void testPy950() {
    doTest();
  }

  public void testIndent() {
    doTest();
  }

  public void testDecorator() {
    doTest();
  }

  public void testLastLine() { // PY-5017
    doTest();
  }

  public void testNestedBlock() { // PY-1343
    doTest();
  }

  public void testFunctionDown() {
    doTest();
  }
}
