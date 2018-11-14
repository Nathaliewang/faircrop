INSERT INTO BUILDING(ID, NAME) VALUES(-10, 'Build1');
INSERT INTO BUILDING(ID, NAME) VALUES(-9, 'Build2');

INSERT INTO ROOM(ID, NAME, FLOOR) VALUES(-10, 'Room1', 1);
INSERT INTO ROOM(ID, NAME, FLOOR) VALUES(-9, 'Room2', 1);

INSERT INTO LIGHT(ID, LEVEL, STATUS, ROOM_ID) VALUES (-1, 8, 'ON', -10);
INSERT INTO LIGHT(ID, LEVEL, STATUS, ROOM_ID) VALUES (-2, 0, 'OFF', -10);