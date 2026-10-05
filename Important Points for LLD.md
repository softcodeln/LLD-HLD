# Important Points for LLD Problem Solving

## 1. Requirements Clarification

During the requirements-clarification step, identify how the system should behave in edge cases. Do not solve those edge cases at this stage.

| Topic | Guidance |
|---|---|
| Goal | Clarify expected system behavior before designing the solution. |
| Edge cases | Identify important edge cases and document the expected behavior. |
| Clarification | Ask the interviewer or stakeholder when the expected behavior is unclear. |
| Assumptions | State a reasonable assumption when clarification is not available. |
| Concurrency | Document what must never happen when multiple requests are processed simultaneously. |

### Edge-Case Documentation

| Edge Case | Expected Behavior |
|---|---|
| Two people try to book the same seat at the same time. | The system must never allow both requests to successfully book the same seat. |

> Always document important concurrency expectations, including what must never happen when multiple requests are processed simultaneously.

## 2. Making Design Patterns Visible in an LLD Solution

When using a design pattern, make its intent and structure easy to identify. Explicitly show the participants, their responsibilities, and how they collaborate. Avoid using a pattern only implicitly through class names or method calls.

| Design Aspect | What to Show |
|---|---|
| Intent | Explain the problem the pattern solves and why it is being used. |
| Participants | Clearly identify the classes, interfaces, or components involved. |
| Responsibilities | Document the responsibility of each participant. |
| Collaboration | Show how participants communicate and work together. |
| Visibility | Make the pattern recognizable in the class diagram, interaction flow, or design explanation. |

## 3. Creational Design Patterns

| Pattern | Important Points |
|---|---|
| To be documented | Add important points here as they are documented. |

## 4. Structural Design Patterns

### 4.1 Facade Design Pattern

| Participant or Guideline | Responsibility / Expectation |
|---|---|
| Business logic | Keep the business logic inside the appropriate subsystem classes. |
| Facade | Coordinate subsystem calls in the required order. |
| Client entry point | Make the facade the single entry point for the client. |
| Client or controller access | Do not allow controllers or clients to call subsystem classes directly. |
| Design visibility | Clearly show the client, facade, and subsystems in the class diagram or interaction flow. |

## 5. Behavioral Design Patterns

### 5.1 Observer Design Pattern

To make the Observer pattern visible, explicitly identify its participants and notification flow.

| Participant or Concept | Responsibility / Expectation |
|---|---|
| Subject | Maintains the observer list and publishes notifications when its state or relevant event changes. |
| Observer interface | Defines the common notification operation implemented by all observers. |
| Concrete observers | Provide independent and interchangeable reactions to notifications. |
| Notification or publish operation | Clearly show the operation used by the subject to notify observers. |
| Number of concrete observers | Show two or three concrete observers to demonstrate that observers are interchangeable. |
| Event object | Pass an event object instead of unrelated primitive arguments. |

### Observer Event Object

The event object should contain the information observers need, allowing each observer to decide how to react without tightly coupling the subject to a specific observer implementation.

| Event Data | Purpose |
|---|---|
| Entity or event IDs | Identify the entity or event that caused the notification. |
| Event type | Describe what happened. |
| Timestamp | Record when the event occurred. |

### Observer Notification Example

```java
onMessage(event)
```

| Benefit | Description |
|---|---|
| Loose coupling | The subject does not need to know the details of each observer's implementation. |
| Extensibility | New observers can be added without changing the subject. |
| Independent reactions | Each observer can decide how to react to the event. |
