A mobilos app demójának tesztje. Pár feature még hiányos benne, de ez javarészt annak köszönhető, hogy nincs egy adatbázis és az azt kezelő backend program elkészítve. Tipikus hibák: Nem relatív szélesség/magasságú elemek(Más méretű képernyőn elcsúsznak) illetve nem scrollolható némelyik felület.

Felület | Kódnév | Jó / Rossz | Komment
--- | --- | --- | ---
Main | Main | Jó | Minden megfelelően működik, a bejelentkezés gombra kattintva a Bejelentkező felület, Regisztrációra kattintva pedig a regisztrációs felület érhető el.
Bejelentkezés | Login | Jó | A felület megjelenik, viszont mivel nincs adatbázis, így nem ellenőriz adatot, a bejelentkezés gombra továbbenged a menübe, regisztrációra kattintva pedig a regiszrációhoz visz.
Regisztráció | Register | Jó | A felület kész van, működik, viszont nem reszponzív. Kissebb képernyőn a textboxok eltűnnek. Regisztrációkor megjelenik egy "Sikeres regisztráció" szövegű felület.
Elfelejtett Jelszó | Forgot_Password | Jó | Emailt kér be az usertől, és az alapján ha lenne adatbázis eldöntené, hogy kiküld egy emailt vagy sem a jelszóval.
Üzenetek | User_Message | Jó | A használt felületek erre a felületre továbbítanak egy adott szöveggel, majd a folytatás gombra kattintva az előző oldal által kijelölt oldalra visz tovább.
Menü | Menu | Jó | A felület kész, viszont nem reszponzív. Itt is eltűnnek elemek kissebb képernyőn.
Lecke | Lecture | Jó | A felület kész, viszont nem reszponzív. A leckének a szövege jelenlegi állássában nem tekerhető, túlcsúszik a képernyő alján. A vizsga gombra továbbvisz az adott lecke vizsgájához.
Vizsga | Task | Jó | Kész, nem reszponzív. Helyes választ lenyomva meghívja az üzenetek ablakot "Helyes válasz" szöveggel, ellenkező esetben pedig "Rossz válasz"-al.
Profil | Profile | Jó | A felület kész van, viszont adatbázis hiánya miatt nem tud megjeleníteni semmit, csak egy blank szöveget.
Ranglista | Leaderboard | Jó | A profilhoz hasonlóan a felület kész, viszont nem tud megjeleníteni adatot.
