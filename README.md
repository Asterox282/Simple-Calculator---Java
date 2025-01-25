# Simple-Calculator---Java
this simple calculator perform a 2 digits calculation.

Program have its own limitations:
all input have type of String where input has been converted to an Integer, therefore maximum vlaue that can be inserted into a calculator is 2<sup>32</sup>-1 (2147483647) or 2<sup>32</sup> when value have prefix - (negative values). If user have inserted 2147483647 as a first value and then used addition operator, result will be rollover of the value: i.e., 2147483647 + 5 = -2147483644

If inserted value cannot be converted to an integer (for example a leeter or a decimal value) then application will raise an error, however no error message will be displayed to user.
+, -, x, / ale allowed operators, and if division operator is used then result will be a float number; to give an user more accurate result.

This application doesn't have s short circuit approach, therefore it is possible to insert invalid operator, but application will not give a result, instead iw will raise an error
