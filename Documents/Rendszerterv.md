## 1. A rendszer célja

A rendszer célja, hogy tanulási lehetőséget biztosítson a diákok számára játékos formában, illetve egy könnyen menedzselhető felületet a tanárok számára, akik feltölthetik ide tananyagaikat. A diákok kiválaszhatnak tananyagokat, amiknek a végére érve egy játékos feladványt kitöltve mérettethetik meg tudásukat. A teljesítményeket mind a diákok, mind a tanárok képesek követni egy ranglista által. Így próbáljuk a diákokat motiválni a tanulásra, és elérni, hogy úgy fejlődhessenek, hogy közbe jól érzik magukat.

## 2. Projekt terv

Projekt terv: Itt soroljuk fel a rendszer létrehozásához rendelkezésre álló erőforrásokat. Ezek
közül a két legfontosabb az emberek és az idő. Fontos tisztázni a felelősségi köröket. Itt adjuk
meg az ütemterv alapján a mérföldköveket. Részei:

**Projekt szerepkörök, felelősségek**
- szerepkörök
    - scrum master: Bettenbuk Dániel
    - senior fejlesztők: 1. Csutorás Péter, 2. Berényi Szabolcs, 3.Guth Dániel, 4.  Hajas Gábor
    - junior fejlesztők: 1. Dudás Bálint, 2. Gajdár Krisztián, 3. Szűcs Norbert, 4. Offenbacher Géza, 5. Lázár Dávid,  6. Veréb Dávid,                            7. Vincze Flórián, 8. Dávid Gergely, 9. Madaras József Károly
- felelősségek:
    - scrum master: A Scrum mester felügyeli és megkönnyíti a folyamat fenntartását, segíti a csapatot, ha problémába ütközik, illetve                      felügyeli, hogy mindenki betartja-e a Scrum alapvető
                   szabályait. Ilyen például, hogy a Sprint időtartama nem térhet el az előre megbeszélttől, még akkor sem, ha az                          elvállalt munka nem lesz kész. Lényegében ő a projekt menedzser.
    - senior fejlesztő: A junior fejlesztők munkájának felügyelete és megkönnyítése tanácsadás által, segíthetnek kisebb projektelemek                           elkészítésében is.
    - junior fejlesztő: A projekt elkészítése.
**Projekt munkások és felelősségeik**
- Webfelület: Guth Dániel, Gajdár Krisztián, Veréb Dávid
- Mobilalkalmazás: Hajas Gábor, Berényi Szabolcs, Dudás Bálint, Szűcs Norbert, Offenbacher Géza
- Backend: Lázár Dávid, Madaras József Károly, Dávid Gergely, Vincze Flórián

A projekt ezen fázisa még tervezés alatt, a pontos feladatok még nem kerültek megállapításra, TODO
**Ütemterv, Mérföldkövek**
2019. 04. 04. A rendszerterv elkészítésének végdátuma
2019. 04. 18. Adatbázis, kezelőfelület, szerver-kliens és néhány egyszerűbb funkció implementálása, első átfogó tesztek
2019. 05. 09. Bonyolultabb funkciók, extra adatbázisok, tananyagok, mintavizsgák feltöltése, alpha tesztre kész
2019. 05. 23. A program átadásának céldátuma

by Vincze Flórián,Dávid Gergely

## 3. Üzleti folyamatok modellje
## 4. Követelmények

Modul | Megnevezés | Hogyan elégítjük ki a követelményt?
---|---|---
<architektúra terv hivatkozás> | Regisztráció | funkcionálos terv hivatkozás |
 - | Bejelentkezés |  |
 - | Kijelentkezés |  |
 - | Elfelejtett jelszó |  |
 - | Általános beállítások |  |
 - | Témák kilistázása |  |
 - | Teszt |  |
 - | Profil előrehaladás |  |
 - | Ranglista | |
 - | G_Offline | |

## 5. Funkcionális terv
## 6. Fizikai környezet
## 7. Absztrakt domain modell
## 8. Architekturális terv

A rendszer 3 rétegből fog állni. Adatbázis réteg az első, erre épül egy logikai réteg, majd a prezentációs réteg. A prezentációs réteg 2 részből fog állni, egy webes felület és egy mobil alkalmazás. A logikai rétek köti össze az adatbázis és prezentációs réteget. A felmerülő változásokat a webes felületen automatikusan frissítésre kerülnek, a felhasználóknak ezzel kapcsolatban nincs teendője. Mobil alkalmazás esetén az alkalmazás automtikusan frissül, amennyiben ez nincs engedélyezve figyelmeztető üzenet jelenik meg az elérhető frissítésről. Meghatározott tervezési minták és alapelvek betartásával a rendszer könnyen és következetesen bővíthető. A rendszer modulokból és pluginekből fog áll, ezzel is a bővtést megkönnyítve. A logikai réteg jogkörtől függően enged hozzáférést az adatokhoz az adatbázisban ezzel fenntartva a biztonságot.

## 9. Adatbázis terv
## 10. Implementációs terv
## 11. Tesztterv
## 12. Telepítési terv

A rendszer  bevezetésekor szükség  lehet  a  személyzet  képzésére, mely  szintén megállapodás tárgyát képezi,   figyelembe   véve   a   ráfordítások   nagyságát.   Ez   a   lépés   nagyban   javíthata   a   rendszer hatékonyságát, illetve segíti a szoftver „személyre szabását”, a jogosultsági szintek helyes beállítását.

## 13. Karbantartási terv
