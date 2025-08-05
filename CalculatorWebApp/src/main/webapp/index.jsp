<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
    <h2>Java Web Calculator</h2>
    <form action="calculate" method="post">
        <input type="number" name="num1" placeholder="First Number" required>
        <select name="operator">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select>
        <input type="number" name="num2" placeholder="Second Number" required>
        <button type="submit">Calculate</button>
    </form>
</body>
</html>
