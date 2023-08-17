package com.afs.unittest;

import com.afs.unittest.exception.UnexpectedProjectTypeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExpenseServiceTest {
    @Test
    void should_return_internal_expense_type_when_getExpenseCodeByProject_given_internal_project() {
        // given
        final var internalProject = new Project(ProjectType.INTERNAL, "Project Internal");
        final var projectService = new ProjectService();
        final var expenseService = new ExpenseService(projectService);
        // when
        final var expenseCodeByProject = expenseService.getExpenseCodeByProject(internalProject);
        // then
        Assertions.assertEquals(ExpenseType.INTERNAL_PROJECT_EXPENSE, expenseCodeByProject);
    }
    @Test
    void should_return_expense_type_A_when_getExpenseCodeByProject_given_project_is_external_and_name_is_project_A() {
        // given

        // when

        // then
    }

    @Test
    void should_return_expense_type_B_when_getExpenseCodeByProject_given_project_is_external_and_name_is_project_B() {
        // given

        // when

        // then
    }

    @Test
    void should_return_other_expense_type_when_getExpenseCodeByProject_given_project_is_external_and_has_other_name() {
        // given

        // when

        // then
    }

    @Test
    void should_throw_unexpected_project_exception_when_getExpenseCodeByProject_given_project_is_invalid() {
        // given

        // when

        // then
    }
}
