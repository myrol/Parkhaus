# Parkhaus
<h3> USERSTORIES </h3>
US04: Als Firmenkunde kann ich mit einer Firmenkarte, das Parkhaus verlassen, um die Kosten an die Firma abzutreten.<br>
US05: Als Parkhauskunde sehe ich vor Einfahrt in das Parkhaus an einer Anzeigetafel, wie viele Parkplätze noch vorhanden sind, um eine unnötige Einfahrt zu vermeiden.<br>
US09: Als Parkhausmitarbeiter benutze ich bei der Einfahrt in das Parkhaus eine Dauerkarte, um Kosten zu sparen.<br>
US10: Als Parkhausbetreiber möchte ich eine Statistik, um den Betrieb des Parkhauses verfolgen zu können.<br>
US11: Als Investor benötige ich eine Finanzübersicht, um meine Anlagen zu überprüfen.<br>
US12: Als Finanzamt benötigen wir eine Finanzübersicht, um den zu versteuernden Betrag festzustellen.<br>

# Klassendokumentation
<h2>Klasse Parkhaus</h2>
<ol>
    <ol> <h3> Einfahren </h3> 
        <li> Überprüft, ob die <i>maximale Anzahl</i> an Autos schon erreicht ist</li>
        <li> Initialisiert User und vergibt seinem Ticket eine <i>Nummer</i> </li>
        <li> Inkrementiert <i>besetzt</i> und <i>insgesamt eingefahrene Autos</i> </li>
        <li> Setzt das Start Datum des Tickets</li>
        <li> Fügt den User den im Parkhaus <i>Parkenden</i> hinzu</li>
    </ol>
    <ol> <h3> Ausfahren </h3>
        <li> Entfernt den User aus den im Parkhaus <i>Parkenden</i></li>
        <li> Setzt beim Ticket das Datum vom <i>Verlassen</i> des Parkhauses</li>
    </ol>
</ol>

<h2>Klasse User</h2>
<ol>
    <li> Initialisiert seinen zugehörigen <i>PKW</i> </li>
    <li> Initialisiert sein <i>Ticket</i> zufälliger Art mit der vom Parkhaus vergebenen Nummer </li>
</ol>

<h2>Klasse Ticket</h2>
<ol>
    <li> Initialisiert das <i>Startdatum</i> und setzt die vom Parkhaus vergebene Nummer </li>
    <li> Berechnet bei der <i>Ausfahrt den Preis</i> und gibt diesen zurück </li>
    <li>
        <ol> <h3> Dauerticket <i>(extends Ticket)</i> </h3>
            <li> Initialisiert den Zeitraum (in Monaten), wie lange der User parken darf </li>
        </ol>
        <ol> <h3> Firmenticket <i>(extends Dauerticket)</i> </h3>
            <li> Setzt zusätzlich das zugehörige Kennzeichen </li>
        </ol>
    </li>
</ol>

<h2>Klasse PKW</h2>
<ol>
    <li> Generiert ein <i>zufälliges Kennzeichen</i> </li>
</ol>