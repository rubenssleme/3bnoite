﻿ALTER TABLE DEMANDA ADD COLUMN ID_MOTIVO_CANCELAMENTO BIGINT;
ALTER TABLE MOTIVO_CANCELAMENTO ADD COLUMN AGENDAMENTO BOOLEAN DEFAULT 'false';
ALTER TABLE MOTIVO_CANCELAMENTO ADD COLUMN DEMANDA BOOLEAN DEFAULT 'false';
UPDATE MOTIVO_CANCELAMENTO set agendamento = true where id in (1, 2, 3, 4, 5);
insert into MOTIVO_CANCELAMENTO (id, descricao, demanda)values(6, 'Patrocinador solicitou o cancelamento.', true);