#schedueledTaskExecutor

Purpose: accept scheduled call from REST API and execute tasks in functional module
Requirement: 
  1. Functional module should only use annotation to activate framework module to expose and execute methods.
  2. API should return "request accepted" or "request rejected: " with reject reason
  3. API allows check status call to return "processing", "idle" with "last execution date/time"
