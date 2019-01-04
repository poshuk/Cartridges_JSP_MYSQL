<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>Замена картриджа</title>
</head>
<body>
<div>
    <h1>
        Замена картриджа
    </h1>
</div>

<form method="post">
    <select required size="1" name="printer_model">
        <option selected disabled>Модель принтера</option>
        <option>Xerox Work Centre 3220</option>
        <option>Canon MF 6140dn</option>
        <option>Samsung ML-2955ND</option>
        <option>Xerox Phaser 7500DN</option>
    </select>

    <select required size="1" name="cartridge_model">
        <option selected disabled>Модель картриджа</option>
        <option>106R01487</option>
        <option>106R01485</option>
        <option>Canon 719</option>
        <option>Canon 719H</option>
        <option>Canon 725</option>
        <option>MLT-D115L/SEE</option>
        <option>MLT-D115L</option>
    </select>

    <select required size="1" name="company">
        <option selected disabled>Предприятие</option>
        <option>ТОВ "Альфа"</option>
        <option>ТОВ "Бета"</option>
        <option>ТОВ "Гамма"</option>
        <option>ТОВ "Дельта"</option>
        <option>ТДВ СК "Лямбда"</option>
    </select>

    <select required size="1" name="department">
        <option selected disabled>Отдел</option>
        <option>Відділ продажу автомобілів</option>
        <option>Відділ сервісу</option>
        <option>Відділ запасних частин</option>
        <option>Бухгалтерія</option>
        <option>Відділ кадрів</option>
        <option>Відділ адміністративної діяльності</option>
        <option>Відділ страхування</option>
    </select>

    <select required size="1" name="claim">
        <option selected disabled>Претензія чи ні?</option>
        <option>Претензія</option>
        <option>Ні</option>
    </select>

    <select required size="1" name="executor">
        <option selected disabled>Виконавець</option>
        <option>Пасічник</option>
        <option>Кортніков</option>
    </select>


    <button type="submit">Submit</button>
</form>
<div>
    <button onclick="location.href='/'">Back to main</button>
</div>

</body>
</html>
