## 1. A rendszer célja

A rendszer célja, hogy tanulási lehetõséget biztosítson a diákok számára játékos formában, illetve egy könnyen menedzselhetõ felületet a tanárok számára, akik feltölthetik ide tananyagaikat. A diákok kiválaszhatnak tananyagokat, amiknek a végére érve egy játékos feladványt kitöltve mérettethetik meg tudásukat. A teljesítményeket mind a diákok, mind a tanárok képesek követni egy ranglista által. Így próbáljuk a diákokat motiválni a tanulásra, és elérni, hogy úgy fejlõdhessenek, hogy közbe jól érzik magukat.

## 2. Projekt terv
## 3. Üzleti folyamatok modellje
## 4. Követelmények
## 5. Funkcionális terv
## 6. Fizikai környezet
## 7. Absztrakt domain modell
## 8. Architekturális terv

A rendszer 3 rétegbõl fog állni. Adatbázis réteg az elsõ, erre épül egy logikai réteg, majd a prezentációs réteg. A prezentációs réteg 2 részbõl fog állni, egy webes felület és egy mobil alkalmazás. A logikai rétek köti össze az adatbázis és prezentációs réteget. A felmerülõ változásokat a webes felületen automatikusan frissítésre kerülnek, a felhasználóknak ezzel kapcsolatban nincs teendõje. Mobil alkalmazás esetén az alkalmazás automtikusan frissül, amennyiben ez nincs engedélyezve figyelmeztetõ üzenet jelenik meg az elérhetõ frissítésrõl. Meghatározott tervezési minták és alapelvek betartásával a rendszer könnyen és következetesen bõvíthetõ. A rendszer modulokból és pluginekbõl fog áll, ezzel is a bõvtést megkönnyítve. A logikai réteg jogkörtõl függõen enged hozzáférést az adatokhoz az adatbázisban ezzel fenntartva a biztonságot.

## 9. Adatbázis terv
## 10. Implementációs terv
## 11. Tesztterv
## 12. Telepítési terv

A rendszer  bevezetésekor szükség  lehet  a  személyzet  képzésére, mely  szintén megállapodás tárgyát képezi,   figyelembe   véve   a   ráfordítások   nagyságát.   Ez   a   lépés   nagyban   javíthata   a   rendszer hatékonyságát, illetve segíti a szoftver „személyre szabását”, a jogosultsági szintek helyes beállítását.

## 13. Karbantartási terv