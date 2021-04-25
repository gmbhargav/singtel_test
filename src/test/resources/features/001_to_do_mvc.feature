@todo_tasks
Feature: Verify Todo MVC
  As a ToDo MVC user, In order to remember the things I want to do
  and I want to manage my todo list


  Scenario: Verify Add new TODO task
    Given I launch the MVC site
    When I Add "Create Repo" Todo task
    Then I should see "Create Repo" task available under "All" todo list
    And I should see "Create Repo" task available under "Active" todo list

  Scenario: Verify Completed TODO task
    Given I Add "Completed Task" Todo task
    And I select "All" filter
    When I select "Completed Task" Todo task as completed
    Then I should see "Completed Task" task marked as completed
    And I should see "Completed Task" task available under "Completed" todo list
    And I should see "Completed Task" task available under "All" todo list


  Scenario: Verify Number of Items left count
    When I Add "Number of Items" Todo task
    Then I should see number of items left displayed

    When I select "Number of Items" Todo task as completed
    Then I should see number of items left count "decreased" by 1

  @rename
  Scenario: Verify Rename Todo task
    Given I launch the MVC site
    And I Add "Rename Task" Todo task
    And I select "All" filter
    When I rename "Rename Task" Todo task as "Updated Task"
    Then I should see "Updated Task" task available under "All" todo list
    And I should see "Rename Task" task not available under "All" todo list

  Scenario: Verify Mark all as complete
    Given I launch the MVC site
    And I Add "Rename Task" Todo task
    And I select "All" filter
    When I rename "Rename Task" Todo task as "Updated Task"
    Then I should see "Updated Task" task available under "All" todo list
    And I should see "Rename Task" task not available under "All" todo list


  Scenario: Verify Clear Completed tasks
    Given I select "All" filter
    And I Add "Clear Completed Task" Todo task
    And  I select "Clear Completed Task" Todo task as completed
    And I select "Completed" filter
    When I clear all completed tasks
    And I should see "Clear Completed Task" task not available under "All" todo list
    And I should see "Clear Completed Task" task not available under "Completed" todo list