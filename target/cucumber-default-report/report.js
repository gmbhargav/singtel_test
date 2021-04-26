$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/001_to_do_mvc.feature");
formatter.feature({
  "name": "Verify Todo MVC",
  "description": "  As a ToDo MVC user, In order to remember the things I want to do\n  and I want to manage my todo list",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@todo_tasks"
    }
  ]
});
formatter.background({
  "name": "Launch TODO MVC Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the MVC site",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_launch_the_MVC_site()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Add new TODO task",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@todo_tasks"
    }
  ]
});
formatter.step({
  "name": "I Add \"Create Repo\" Todo task",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_Add_Todo_task(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"Create Repo\" task available under \"All\" todo list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_should_see_task_available_under_todo_list(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"Create Repo\" task available under \"Active\" todo list",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_should_see_task_available_under_todo_list(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", "Verify_Add_new_TODO_task");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Launch TODO MVC Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the MVC site",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_launch_the_MVC_site()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Number of Items left count matching with Active Tasks",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@todo_tasks"
    }
  ]
});
formatter.step({
  "name": "I Add \"Active Task\" Todo task",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_Add_Todo_task(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Add \"Active Task2\" Todo task",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_Add_Todo_task(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"Active\" filter",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_select_tasks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see number of items left count is matching with active tasks",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_should_see_active_tasks_matching_with_items_left()"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png", "Verify_Number_of_Items_left_count_matching_with_Active_Tasks");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Launch TODO MVC Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the MVC site",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_launch_the_MVC_site()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Completed TODO task",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@todo_tasks"
    }
  ]
});
formatter.step({
  "name": "I Add \"Completed Task\" Todo task",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_Add_Todo_task(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"All\" filter",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_select_tasks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"Completed Task\" Todo task as completed",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_select_Todo_task_as_completed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"Completed Task\" task marked as completed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_should_see_task_marked_as_completed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"Completed Task\" task available under \"Completed\" todo list",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_should_see_task_available_under_todo_list(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"Completed Task\" task available under \"All\" todo list",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_should_see_task_available_under_todo_list(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png", "Verify_Completed_TODO_task");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Launch TODO MVC Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the MVC site",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_launch_the_MVC_site()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Number of Items left count",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@todo_tasks"
    }
  ]
});
formatter.step({
  "name": "I Add \"Number of Items\" Todo task",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_Add_Todo_task(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see number of items left displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_should_see_number_of_items()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"Number of Items\" Todo task as completed",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_select_Todo_task_as_completed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see number of items left count \"decreased\" by 1",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_should_see_number_of_items_count_by(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png", "Verify_Number_of_Items_left_count");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Launch TODO MVC Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the MVC site",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_launch_the_MVC_site()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Rename Todo task",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@todo_tasks"
    }
  ]
});
formatter.step({
  "name": "I launch the MVC site",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_launch_the_MVC_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Add \"Rename Task\" Todo task",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_Add_Todo_task(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"All\" filter",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_select_tasks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I rename \"Rename Task\" Todo task as \"Updated Task\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_rename_Todo_task(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"Updated Task\" task available under \"All\" todo list",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_should_see_task_available_under_todo_list(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"Rename Task\" task not available under \"All\" todo list",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_should_see_task_not_available_under_todo_list(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png", "Verify_Rename_Todo_task");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Launch TODO MVC Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the MVC site",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_launch_the_MVC_site()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Mark all tasks as completed",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@todo_tasks"
    }
  ]
});
formatter.step({
  "name": "I launch the MVC site",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_launch_the_MVC_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Add \"Mark All Task1\" Todo task",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_Add_Todo_task(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Add \"Mark All Task2\" Todo task",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_Add_Todo_task(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"All\" filter",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_select_tasks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I mark all tasks as completed",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_mark_all_tasks_as_completed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see all tasks marked as completed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_should_see_all_task_marked_completed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see 0 number of items left displayed",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_should_n_see_number_of_items(int)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png", "Verify_Mark_all_tasks_as_completed");
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Launch TODO MVC Page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch the MVC site",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_launch_the_MVC_site()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify Clear Completed tasks",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@todo_tasks"
    }
  ]
});
formatter.step({
  "name": "I select \"All\" filter",
  "keyword": "Given "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_select_tasks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Add \"Clear Completed Task\" Todo task",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_Add_Todo_task(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"Clear Completed Task\" Todo task as completed",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_select_Todo_task_as_completed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select \"Completed\" filter",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_select_tasks(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I clear all completed tasks",
  "keyword": "When "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_clear_completed_tasks()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"Clear Completed Task\" task not available under \"All\" todo list",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_should_see_task_not_available_under_todo_list(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see \"Clear Completed Task\" task not available under \"Completed\" todo list",
  "keyword": "And "
});
formatter.match({
  "location": "com.automation.stepdefs.ToDoTaskStepDef.i_should_see_task_not_available_under_todo_list(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.embedding("image/png", "embedded6.png", "Verify_Clear_Completed_tasks");
formatter.after({
  "status": "passed"
});
});