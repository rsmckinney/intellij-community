// Copyright 2000-2017 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package com.intellij.java.codeInsight.daemon.quickFix;

import com.intellij.codeInsight.daemon.quickFix.LightQuickFixParameterizedTestCase;
import com.intellij.codeInspection.LocalInspectionTool;
import com.intellij.codeInspection.MoveConditionToLoopInspection;
import org.jetbrains.annotations.NotNull;

public class MoveConditionToLoopInspectionTest extends LightQuickFixParameterizedTestCase {
  @NotNull
  @Override
  protected LocalInspectionTool[] configureLocalInspectionTools() {
    return new LocalInspectionTool[]{new MoveConditionToLoopInspection()};
  }

  public void test() {
     doAllTests();
   }


  @Override
  protected String getBasePath() {
    return "/codeInsight/moveConditionToLoop/";
  }
}