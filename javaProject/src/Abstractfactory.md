Voor de abstract factory is er een aandrijving selectie

De tank en de motor moeten bij elkaar horen.

Om dit voor te stellen voert class Auto het volgende uit bij start:
    
- roept start(tank) aan bij de motor

Motor vertelt met start welke energie uit de tank gehaald wordt.
Deze moet passen bij het type motor.
De abstract factory zorgt ervoor dat de gewone factory de juiste tank en motor bij elkaar geleverd worden.
Per energietype is er een abstract factory