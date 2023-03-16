# HB-One-OneMapping

Mapping in hibernate
==================
In realtime applications, we use mapping to link two classes and these linking
at the database side will happen in the form
of primary-key foreign-key relationship.
At the java side, we can link 2 classes through "Association".
At the database side we don't have these linking,but we have something called as
"Primary-Foreing" key relationship.
To support this feature at the hibernate side we have "Mapping".
There are 4 types of hibernate mapping
a. One-One Association Mapping
b. One-Many Association Mapping
c. Many-One Association Mapping
d. Many-Many Association Mapping
UniDirectional
-------------------
One-One Association Mapping
-----------------------------------------
It refers to relationship b/w 2 entities where one instance of one entity should be
mapped with exactly one instance of
another entity.

eg: One Employee has One Account
Annotation used is :: @OneToOne(cascade = CascadeType.ALL)
cascade specifies, if we delete employee table automatically account table also
should be deleted
