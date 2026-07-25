# Difference between JPA, Hibernate and Spring Data JPA

## Java Persistence API (JPA)

- JPA is a Java Persistence Specification (JSR 338).
- It is used for persisting, reading and managing data from Java objects.
- JPA is only a specification.
- It does not provide its own implementation.

## Hibernate

- Hibernate is an ORM (Object Relational Mapping) tool.
- Hibernate is one of the implementations of JPA.
- It maps Java objects to database tables.

## Spring Data JPA

- Spring Data JPA does not implement JPA.
- It reduces boilerplate code.
- It provides another abstraction layer over Hibernate.
- It manages transactions.

## Comparison

| JPA | Hibernate | Spring Data JPA |
|-----|-----------|-----------------|
| Specification | JPA Implementation | Abstraction over Hibernate |
| No implementation | ORM Tool | Reduces boilerplate code |
| Defines rules | Implements JPA | Uses Repository interfaces |

## Conclusion

Spring Data JPA makes database operations easier by reducing code while using Hibernate as the JPA implementation.
