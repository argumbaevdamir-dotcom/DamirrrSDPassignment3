# Assignment 3 — Bridge

This package demonstrates the Bridge structural design pattern for the car configurator project.

## Structure

- `CarInformationView` — Abstraction
- `CarSummaryView`, `CarSafetyView` — Refined Abstractions
- `CarInformationRenderer` — Implementor
- `ConsoleCarRenderer`, `JsonCarRenderer` — Concrete Implementors
- `BridgeMain` — Client

## Clean Code principles

1. **Separation of responsibilities** — views contain car-information logic while renderers handle output.
2. **Meaningful names** — class names clearly distinguish abstraction and implementation roles.
3. **Small, focused classes** — each class has one focused responsibility.
4. **No duplicated rendering logic** — output behavior is centralized in the renderer implementations.
5. **Backward-compatible design** — a new renderer can be added without changing the abstraction classes.

The client composes an abstraction with an implementation at runtime and demonstrates switching implementations without changing the abstraction-side design.
