create table public.t_cliente (
    id_cliente character varying(255) not null,
    data_de_nascimento date not null,
    documento_pessoal character varying(255) not null,
    nome_cliente character varying(255) not null,
    sexo character varying(255) not null,
    tipo_documento character varying(255) not null,
    constraint t_cliente_pkey primary key (id_cliente),
    constraint t_cliente_sexo_check check (
        (
            (sexo)::text = any (
                (
                    array[
                        'Masculino'::character varying,
                        'Feminino'::character varying
                    ]
                )::text[]
            )
        )
    ),
    constraint t_cliente_tipo_documento_check check (
        (
            (tipo_documento)::text = any (
                (
                    array['RG'::character varying, 'CPF'::character varying]
                )::text[]
            )
        )
    )
) TABLESPACE pg_default;

create table public.t_programa (
    id_programa character varying(255) not null,
    descricao character varying(255) null,
    nome_programa character varying(255) null,
    constraint t_programa_pkey primary key (id_programa)
) TABLESPACE pg_default;

create table public.t_lead_origem (
    id_origem character varying(255) not null,
    descricao character varying(255) null,
    nome_origem character varying(255) null,
    constraint t_lead_origem_pkey primary key (id_origem)
) TABLESPACE pg_default;

create table public.t_lead (
    id_lead character varying(255) not null,
    empresa_lead_informada character varying(255) null,
    data_criacao date null,
    data_fechamento date null,
    interesse character varying(255) null,
    estagio character varying(255) null,
    nome_lead character varying(255) null,
    id_origem character varying(255) not null,
    id_programa character varying(255) not null,
    constraint t_lead_pkey primary key (id_lead),
    constraint fkc5okangm6drkxcsrdgbi5t7il foreign KEY (id_programa) references t_programa (id_programa),
    constraint fkflkr1qkent6d555sh0wbcaavf foreign KEY (id_origem) references t_lead_origem (id_origem)
) TABLESPACE pg_default;

create table public.t_empresa (
    id_empresa character varying(255) not null,
    razao_social character varying(255) null,
    pais character varying(255) null,
    numero_funcionarios integer null,
    data_fundacao character varying(255) null,
    segmento character varying(255) null,
    tax_id character varying(255) null,
    nome_fantasia character varying(255) null,
    tipo_tax_id character varying(255) null,
    id_cliente character varying(255) not null,
    constraint t_empresa_pkey primary key (id_empresa),
    constraint fkkt5092oeeslk2fmtqer86potc foreign KEY (id_cliente) references t_cliente (id_cliente)
) TABLESPACE pg_default;

create table public.t_contratos (
    id_contrato character varying(255) not null,
    valor_total double precision null,
    status_contrato character varying(255) null,
    tipo_contrato character varying(255) null,
    data_fim date not null,
    forma_pagamento double precision null,
    renovacoes_totais integer null,
    data_inicio date not null,
    id_cliente character varying(255) not null,
    id_empresa character varying(255) not null,
    id_programa character varying(255) not null,
    constraint t_contratos_pkey primary key (id_contrato),
    constraint fk7y64r8wohrbph4feglqub5knk foreign KEY (id_cliente) references t_cliente (id_cliente),
    constraint fkbf3rjjbry6p6bluboi34vjl0i foreign KEY (id_programa) references t_programa (id_programa),
    constraint fkqicnpchyv6mc91e3wynwueiyg foreign KEY (id_empresa) references t_empresa (id_empresa)
) TABLESPACE pg_default;

create table public.t_briefing (
    id_briefing character varying(255) not null,
    data_criacao date not null,
    observacoes_gerais character varying(255) null,
    status_briefing smallint not null,
    data_atualizacao date not null,
    versao integer not null,
    id_cliente character varying(255) not null,
    id_empresa character varying(255) not null,
    id_contrato character varying(255) null,
    id_lead character varying(255) not null,
    constraint t_briefing_pkey primary key (id_briefing),
    constraint fk7tl9t7o35kvwbrb9m119si9cr foreign KEY (id_cliente) references t_cliente (id_cliente),
    constraint fkcplu0kjwbyuwl7t8jdys18q85 foreign KEY (id_lead) references t_lead (id_lead),
    constraint fkki21sin8mvq6fli6exdmtdtmc foreign KEY (id_contrato) references t_contratos (id_contrato),
    constraint fktmqfswkc43l8f87ihaleu6mgb foreign KEY (id_empresa) references t_empresa (id_empresa),
    constraint t_briefing_status_briefing_check check (
        (
            (status_briefing >= 0)
            and (status_briefing <= 3)
        )
    )
) TABLESPACE pg_default;

create table public.t_email (
    id_email character varying(255) not null,
    endereco_email character varying(255) null,
    constraint t_email_pkey primary key (id_email)
) TABLESPACE pg_default;

create table public.t_telefone (
    id_telefone character varying(255) not null,
    ddd integer null,
    ddi integer null,
    prefixo integer null,
    sufixo integer null,
    tipo character varying(255) null,
    constraint t_telefone_pkey primary key (id_telefone)
) TABLESPACE pg_default;

create table public.t_usuario (
    id_usuario character varying(255) not null,
    email character varying(255) null,
    senha character varying(255) null,
    constraint t_usuario_pkey primary key (id_usuario)
) TABLESPACE pg_default;

create table public.t_data_comemorativa (
    id_data_comemorativa character varying(255) not null,
    descricao character varying(255) not null,
    nome_data_comemorativa character varying(255) not null,
    constraint t_data_comemorativa_pkey primary key (id_data_comemorativa)
) TABLESPACE pg_default;

create table public.t_servico (
    id_servico character varying(255) not null,
    categoria character varying(255) null,
    descricao character varying(255) null,
    nome_servico character varying(255) null,
    constraint t_servico_pkey primary key (id_servico)
) TABLESPACE pg_default;

create table public.t_colaborador (
                                      id character varying(255) not null,
                                      account character varying(10) not null,
                                      additional_documents character varying(255) [] null,
                                      admission_date character varying(255) not null,
                                      agency character varying(9) not null,
                                      bank character varying(15) not null,
                                      birthday character varying(255) not null,
                                      city character varying(155) not null,
                                      civil_state character varying(255) not null,
                                      cnpj_transportation_voucher character varying(18) null,
                                      cpf character varying(14) null,
                                      department character varying(24) not null,
                                      documentation character varying(255) null,
                                      email character varying(155) not null,
                                      labor_modality character varying(11) not null,
                                      labor_scale character varying(4) not null,
                                      level character varying(9) not null,
                                      monthly_amount numeric(15, 2) null,
                                      mother_name character varying(155) not null,
                                      name character varying(155) not null,
                                      neighborhood character varying(155) not null,
                                      operation character varying(3) not null,
                                      phone character varying(19) not null,
                                      pis_pasep character varying(14) null,
                                      pix character varying(155) not null,
                                      postal_code character varying(10) not null,
                                      quit_date date null,
                                      reservist boolean not null,
                                      residential_prove character varying(255) null,
                                      rg character varying(12) null,
                                      salary numeric(15, 2) not null,
                                      status character varying(8) not null,
                                      street character varying(155) not null,
                                      transportation_voucher boolean not null,
                                      type_employment character varying(9) not null,
                                      work_card character varying(14) null,
                                      constraint t_colaborador_pkey primary key (id),
                                      constraint uk18xfi5t7qe6i4mugxfltk1ewb unique (cpf),
                                      constraint uk3eada7stkfmgsdsrdphn15uua unique (phone),
                                      constraint uk67rgymbc7i2yem2v2s5ivt1fh unique (work_card),
                                      constraint uk9m67w16sq7s5d2xx93a2jjtan unique (pix),
                                      constraint ukdii92u78qf41o7soc653qcyew unique (account),
                                      constraint ukebp4mt74ldoqyijyx1mct7j4l unique (rg),
                                      constraint ukoysl04kx943ywtommnviw4dho unique (email),
                                      constraint uktp9i3a2kutsvae38iptf8dwr2 unique (pis_pasep),
                                      constraint t_colaborador_type_employment_check check (
                                          (
                                              (type_employment)::text = any (
                                          (
                                          array[
                                          'CLT'::character varying,
                                          'CNPJ'::character varying,
                                          'FREELANCE'::character varying
                                          ]
                                          )::text[]
                                          )
)
    ),
    constraint t_colaborador_civil_state_check check (
      (
        (civil_state)::text = any (
          (
            array[
              'SINGLE'::character varying,
              'MARRIED'::character varying,
              'WIDOWED'::character varying
            ]
          )::text[]
        )
      )
    ),
    constraint t_colaborador_department_check check (
      (
        (department)::text = any (
          (
            array[
              'RESEARCH_AND_DEVELOPMENT'::character varying,
              'WEB_DESIGN'::character varying,
              'PAID_TRAFFIC'::character varying
            ]
          )::text[]
        )
      )
    ),
    constraint t_colaborador_labor_modality_check check (
      (
        (labor_modality)::text = any (
          (
            array[
              'IN_PERSON'::character varying,
              'HYBRID'::character varying,
              'HOME_OFFICE'::character varying
            ]
          )::text[]
        )
      )
    ),
    constraint t_colaborador_labor_scale_check check (
      (
        (labor_scale)::text = any (
          (
            array[
              '_5X2'::character varying,
              '_4X3'::character varying,
              '_6X1'::character varying
            ]
          )::text[]
        )
      )
    ),
    constraint t_colaborador_level_check check (
      (
        (level)::text = any (
          (
            array[
              'PUPPY'::character varying,
              'ASSISTANT'::character varying,
              'JUNIOR'::character varying
            ]
          )::text[]
        )
      )
    ),
    constraint t_colaborador_operation_check check (
      (
        (operation)::text = any (
          (
            array[
              '_01'::character varying,
              '_02'::character varying,
              '_03'::character varying
            ]
          )::text[]
        )
      )
    ),
    constraint t_colaborador_status_check check (
      (
        (status)::text = any (
          (
            array[
              'ACTIVE'::character varying,
              'INACTIVE'::character varying
            ]
          )::text[]
        )
      )
    ),
    constraint t_colaborador_bank_check check (
      (
        (bank)::text = any (
          (
            array[
              'SANTANDER'::character varying,
              'SICRED'::character varying,
              'BANCO_DO_BRASIL'::character varying
            ]
          )::text[]
        )
      )
    )
  ) TABLESPACE pg_default;

create table public.t_briefing_acesso (
    id_acesso character varying(255) not null,
    observacoes character varying(255) null,
    status_acesso character varying(255) null,
    tipo_acesso character varying(255) null,
    usuario_login character varying(255) null,
    data_validacao date not null,
    id_briefing character varying(255) null,
    validado_por character varying(255) null,
    constraint t_briefing_acesso_pkey primary key (id_acesso),
    constraint fkcxrposr586kqudgrdvffur95 foreign KEY (validado_por) references t_colaborador (id),
    constraint fkslh2gagjifwvefneqfcojmd1k foreign KEY (id_briefing) references t_briefing (id_briefing)
) TABLESPACE pg_default;

create table public.aditivo (
    id_aditivo character varying(255) not null,
    valor_adicional double precision null,
    descricao character varying(255) null,
    data_fim date not null,
    data_inicio date not null,
    status_aditivo character varying(255) not null,
    tipo_aditivo character varying(255) not null,
    id_contrato character varying(255) not null,
    constraint aditivo_pkey primary key (id_aditivo),
    constraint fkpdfsj98iu7cfg34mxrb53b049 foreign KEY (id_contrato) references t_contratos (id_contrato)
) TABLESPACE pg_default;

create table public.t_briefing_secao (
    id_secao character varying(255) not null,
    nome_secao character varying(255) null,
    status_secao character varying(255) null,
    fase_responsavel character varying(255) null,
    data_atualizacao date not null,
    id_briefing character varying(255) null,
    responsavel_operacao character varying(255) null,
    constraint t_briefing_secao_pkey primary key (id_secao),
    constraint fklrje6iusfiegelwgbpf3di1fr foreign KEY (id_briefing) references t_briefing (id_briefing),
    constraint fktehtw34eb5ytq3hy4fu3ccumb foreign KEY (responsavel_operacao) references t_colaborador (id)
) TABLESPACE pg_default;

create table public.t_briefing_campo (
    id_campo character varying(255) not null,
    origem_padrao character varying(255) null,
    id_tabela_destino character varying(255) not null,
    nome_campo character varying(255) null,
    tipo_campo character varying(255) null,
    ordem_exibicao integer not null,
    obrigatorio boolean null,
    id_secao character varying(255) not null,
    constraint t_briefing_campo_pkey primary key (id_campo),
    constraint fk5fxdkk601vq37otba4xihrxbe foreign KEY (id_secao) references t_briefing_secao (id_secao)
) TABLESPACE pg_default;

create table public.t_briefing_arquivo (
    id_arquivo character varying(255) not null,
    nome_arquivo character varying(255) null,
    tipo_arquivo character varying(255) null,
    data_upload date not null,
    url_arquivo character varying(255) null,
    id_briefing character varying(255) null,
    enviado_por character varying(255) null,
    constraint t_briefing_arquivo_pkey primary key (id_arquivo),
    constraint fk5r3ndl7m87plipbetfq6ybj77 foreign KEY (id_briefing) references t_briefing (id_briefing),
    constraint fkp7mt6boyh393x5e25knegqacn foreign KEY (enviado_por) references t_colaborador (id)
) TABLESPACE pg_default;

create table public.t_briefing_resposta (
    id_resposta character varying(255) not null,
    sincronizado boolean null,
    origem_resposta character varying(255) null,
    valor_resposta character varying(255) not null,
    data_resposta date not null,
    data_sincronizacao date not null,
    validado boolean null,
    id_campo character varying(255) null,
    atualizado_por character varying(255) null,
    constraint t_briefing_resposta_pkey primary key (id_resposta),
    constraint fkh7hxagls8aewjkwdxxj5tn074 foreign KEY (atualizado_por) references t_colaborador (id),
    constraint fkibjfwx82b9nrg1honps2kig2j foreign KEY (id_campo) references t_briefing_campo (id_campo)
) TABLESPACE pg_default;

create table public.t_briefing_log_sincronizacao (
    id_log character varying(255) not null,
    campo_destino character varying(255) null,
    valor_antigo character varying(255) null,
    tabela_destino character varying(255) null,
    data_execucao date not null,
    valor_novo character varying(255) null,
    id_resposta character varying(255) null,
    atualizado_por character varying(255) null,
    constraint t_briefing_log_sincronizacao_pkey primary key (id_log),
    constraint fka9omdof6hn3dj84fmvxnw4cm7 foreign KEY (atualizado_por) references t_colaborador (id),
    constraint fkkd5a44sk98typ88bjksn790co foreign KEY (id_resposta) references t_briefing_resposta (id_resposta)
) TABLESPACE pg_default;

create table public.t_seguro_empresa (
    id_seguro character varying(255) not null,
    validade character varying(255) null,
    tipo_seguro character varying(255) null,
    apolice character varying(255) null,
    id_empresa character varying(255) not null,
    constraint t_seguro_empresa_pkey primary key (id_seguro),
    constraint fko88jbi6943gny2ay0snqjm768 foreign KEY (id_empresa) references t_empresa (id_empresa)
) TABLESPACE pg_default;

create table public.t_empresa_email (
    id_empresa_email character varying(255) not null,
    id_empresa character varying(255) not null,
    id_email character varying(255) not null,
    constraint t_empresa_email_pkey primary key (id_empresa_email),
    constraint fk470lfst0fcsijnkw32ixuillm foreign KEY (id_empresa) references t_empresa (id_empresa),
    constraint fk6ud27ot7jp7rvr7fb942hppx2 foreign KEY (id_email) references t_email (id_email)
) TABLESPACE pg_default;

create table public.t_gmb_empresa (
    id_gmb character varying(255) not null,
    email_vinculado_gmb character varying(255) null,
    nome_conta_gmb character varying(255) null,
    id_empresa character varying(255) not null,
    constraint t_gmb_empresa_pkey primary key (id_gmb),
    constraint fki8gjegh6sxt5sksthtoxnonk0 foreign KEY (id_empresa) references t_empresa (id_empresa)
) TABLESPACE pg_default;

create table public.t_funcionamento_empresa (
    id_referencia character varying(255) not null,
    observacoes character varying(255) null,
    dias_funcionamento character varying(255) null,
    horario_funcionamento character varying(255) null,
    id_empresa character varying(255) not null,
    constraint t_funcionamento_empresa_pkey primary key (id_referencia),
    constraint fkqc0umbrska6raywauxypkpppn foreign KEY (id_empresa) references t_empresa (id_empresa)
) TABLESPACE pg_default;

create table public.t_empresa_telefone (
    id_empresa_telefone character varying(255) not null,
    id_empresa character varying(255) not null,
    id_telefone character varying(255) not null,
    constraint t_empresa_telefone_pkey primary key (id_empresa_telefone),
    constraint fkkc83x4y5x3075h8j5tkjo7uhs foreign KEY (id_empresa) references t_empresa (id_empresa),
    constraint fktlryx9vu8t6wppa7eat1154ml foreign KEY (id_telefone) references t_telefone (id_telefone)
) TABLESPACE pg_default;

create table public.t_referencia_empresa (
    id_referencia character varying(255) not null,
    observacao character varying(255) null,
    nome_referencia character varying(255) null,
    url_referencia character varying(255) null,
    id_empresa character varying(255) not null,
    constraint t_referencia_empresa_pkey primary key (id_referencia),
    constraint fkjat9cl35rtnli1mq933vqfh5f foreign KEY (id_empresa) references t_empresa (id_empresa)
) TABLESPACE pg_default;

create table public.t_site_empresa (
    id_site character varying(255) not null,
    dominio character varying(255) null,
    hospedagem character varying(255) null,
    url character varying(255) null,
    id_empresa character varying(255) not null,
    constraint t_site_empresa_pkey primary key (id_site),
    constraint fk7hmjoc20s26skgr1vc3220ea0 foreign KEY (id_empresa) references t_empresa (id_empresa)
) TABLESPACE pg_default;

create table public.t_rede_social_empresa (
    id_gmb character varying(255) not null,
    plataforma character varying(255) null,
    url character varying(255) null,
    id_empresa character varying(255) not null,
    constraint t_rede_social_empresa_pkey primary key (id_gmb),
    constraint fks1ld81tghigebx5hwddr0rd79 foreign KEY (id_empresa) references t_empresa (id_empresa)
) TABLESPACE pg_default;

create table public.t_cliente_email (
    id_cliente_email character varying(255) not null,
    id_cliente character varying(255) not null,
    id_email character varying(255) not null,
    constraint t_cliente_email_pkey primary key (id_cliente_email),
    constraint fk9eley6uvepxlvln2g7inyqg10 foreign KEY (id_cliente) references t_cliente (id_cliente),
    constraint fkquosp99x81hyda6bo1xmayrf9 foreign KEY (id_email) references t_email (id_email)
) TABLESPACE pg_default;

create table public.t_cliente_telefone (
    id_cliente_telefone character varying(255) not null,
    id_lead character varying(255) not null,
    id_telefone character varying(255) not null,
    constraint t_cliente_telefone_pkey primary key (id_cliente_telefone),
    constraint fkr772kp7i1dfg810yffiqmi6g4 foreign KEY (id_telefone) references t_telefone (id_telefone),
    constraint fks23uxnb9ed1wx0n917u06nht0 foreign KEY (id_lead) references t_cliente (id_cliente)
) TABLESPACE pg_default;

create table public.t_data (
    id_data character varying(255) not null,
    id_data_comemorativa character varying(255) not null,
    id_empresa character varying(255) not null,
    constraint t_data_pkey primary key (id_data),
    constraint fkfrwrbfwp53v98siv8nfphofah foreign KEY (id_data_comemorativa) references t_data_comemorativa (id_data_comemorativa),
    constraint fkhjldb3knj6a2mjuanrmcnls5 foreign KEY (id_empresa) references t_empresa (id_empresa)
) TABLESPACE pg_default;

create table public.t_contrato_colaborador (
    id_contrato character varying(255) not null,
    percentual_comissao character varying(255) null,
    valor_comissao character varying(255) null,
    contrato character varying(255) null,
    observacoes character varying(255) null,
    data_participacao date null,
    id_colaborador character varying(255) not null,
    constraint t_contrato_colaborador_pkey primary key (id_contrato),
    constraint fkl3utc909m3yc2r626ixayhmgu foreign KEY (id_colaborador) references t_colaborador (id)
) TABLESPACE pg_default;

create table public.t_org_unidade (
    id_unidade character varying(255) not null,
    codigo character varying(255) null,
    nome_unidade character varying(255) null,
    tipo_unidade character varying(255) null,
    id_cliente character varying(255) not null,
    constraint t_org_unidade_pkey primary key (id_unidade),
    constraint fkn256e15t2lukk8iluuput9o9c foreign KEY (id_cliente) references t_cliente (id_cliente)
) TABLESPACE pg_default;

create table public.t_colaborador_alocação (
    id_colaborador_alocacao character varying(255) not null,
    documento character varying(255) null,
    data_final date null,
    observacoes character varying(255) null,
    data_inicio date null,
    id_colaborador character varying(255) not null,
    id_org_unidade character varying(255) not null,
    constraint t_colaborador_alocação_pkey primary key (id_colaborador_alocacao),
    constraint fk6n959k0tuure2js1hgri6s5iu foreign KEY (id_org_unidade) references t_org_unidade (id_unidade),
    constraint fkkw2fkpf865ilgkhaev289pky4 foreign KEY (id_colaborador) references t_colaborador (id)
) TABLESPACE pg_default;

create table public.t_briefing_colaborador (
    id_briefing_colaborador character varying(255) not null,
    data_fim_responsabilidade date null,
    funcao_no_briefing character varying(255) null,
    data_inicio_responsabilidade date null,
    status character varying(255) null,
    id_briefing character varying(255) null,
    id_colaborador character varying(255) null,
    constraint t_briefing_colaborador_pkey primary key (id_briefing_colaborador),
    constraint fkbeqk8o1mv15hlqk9jrgj1epr9 foreign KEY (id_briefing) references t_briefing (id_briefing),
    constraint fkre141mh4phi5thym7d86hdc3t foreign KEY (id_colaborador) references t_colaborador (id)
) TABLESPACE pg_default;

create table public.t_email_colaborador (
    id_email_colaborador character varying(255) not null,
    documento_pessoal character varying(255) null,
    endereco_email_colaborador character varying(255) null,
    rotulo character varying(255) null,
    id_colaborador character varying(255) not null,
    constraint t_email_colaborador_pkey primary key (id_email_colaborador),
    constraint fk652709mxd0asaw6hljcwurhn3 foreign KEY (id_colaborador) references t_colaborador (id)
) TABLESPACE pg_default;

create table public.t_telefone_colaborador (
    id_telefone_colaborador character varying(255) not null,
    ddd character varying(255) null,
    ddi character varying(255) null,
    prefixo character varying(255) null,
    sufixo character varying(255) null,
    rotulo character varying(255) null,
    tipo character varying(255) null,
    id_colaborador character varying(255) not null,
    constraint t_telefone_colaborador_pkey primary key (id_telefone_colaborador),
    constraint fk710vd9g91o0d6g3b7j2tw2ejk foreign KEY (id_colaborador) references t_colaborador (id)
) TABLESPACE pg_default;

create table public.t_financeiro_empresa (
    id_financeiro character varying(255) not null,
    data_base character varying(255) null,
    ticket_medio_inicial double precision null,
    faturamento_inicial character varying(255) null,
    id_empresa character varying(255) not null,
    constraint t_financeiro_empresa_pkey primary key (id_financeiro),
    constraint fklfn5ny4d2tkdyyya2os623s38 foreign KEY (id_empresa) references t_empresa (id_empresa)
) TABLESPACE pg_default;

create table public.t_cotrato_parcela (
    id_parcela character varying(255) not null,
    data_vencimento date not null,
    valor_parcela double precision null,
    numero_parcela character varying(255) null,
    status_parcela character varying(255) null,
    id_contrato character varying(255) null,
    id_aditivo character varying(255) null,
    constraint t_cotrato_parcela_pkey primary key (id_parcela),
    constraint fk32maiy3200uj1g5w77o3bnqlr foreign KEY (id_contrato) references t_contratos (id_contrato),
    constraint fktriixgh23mxrtti6lrxj7d7ll foreign KEY (id_aditivo) references aditivo (id_aditivo)
) TABLESPACE pg_default;

--create table public.t_gmb_empresa (
--    id_gmb character varying(255) not null,
--    email_vinculado_gmb character varying(255) null,
--    nome_conta_gmb character varying(255) null,
--    id_empresa character varying(255) not null,
--    constraint t_gmb_empresa_pkey primary key (id_gmb),
--    constraint fki8gjegh6sxt5sksthtoxnonk0 foreign KEY (id_empresa) references t_empresa (id_empresa)
--) TABLESPACE pg_default;

create table public.t_lead_email (
    id_lead_email character varying(255) not null,
    id_client character varying(255) not null,
    id_email character varying(255) not null,
    constraint t_lead_email_pkey primary key (id_lead_email),
    constraint fk6udufkglsaiv1x2ef1k9j8l31 foreign KEY (id_client) references t_cliente (id_cliente),
    constraint fkesae4w91iys82mnwdu5vqgsp3 foreign KEY (id_email) references t_email (id_email)
) TABLESPACE pg_default;

create table public.t_lead_telefone (
    id_lead_telefone character varying(255) not null,
    id_lead character varying(255) not null,
    id_telefone character varying(255) not null,
    constraint t_lead_telefone_pkey primary key (id_lead_telefone),
    constraint fkg2cb1p4dwb440h8kgfcg28kvs foreign KEY (id_lead) references t_lead (id_lead),
    constraint fknfyvvkwvnsp5hsmm14f15qf55 foreign KEY (id_telefone) references t_telefone (id_telefone)
) TABLESPACE pg_default;

create table public.t_pagamento (
    id_pagamento character varying(255) not null,
    metodo_pagamento character varying(255) null,
    data_pagamento date not null,
    status character varying(255) null,
    transacao_id character varying(255) null,
    valor_pago double precision null,
    id_parcela character varying(255) null,
    constraint t_pagamento_pkey primary key (id_pagamento),
    constraint fk7sb9tf198jcjgkwhsnpfsivt7 foreign KEY (id_parcela) references aditivo (id_aditivo)
) TABLESPACE pg_default;

create table public.t_area_servico (
    id_area_servico character varying(255) not null,
    descricao character varying(255) null,
    nome_area character varying(255) null,
    id_empresa character varying(255) null,
    constraint t_area_servico_pkey primary key (id_area_servico),
    constraint fkehtsagmheg6dbufnpyrbgoawx foreign KEY (id_empresa) references t_empresa (id_empresa)
) TABLESPACE pg_default;

create table public.t_briefing_visibilidade (
    id_visibilidade character varying(255) not null,
    nivel_acesso character varying(255) null,
    id_secao character varying(255) null,
    id_org_unidade character varying(255) null,
    constraint t_briefing_visibilidade_pkey primary key (id_visibilidade),
    constraint fkar7x86f3eldl5hsa8lv368ub9 foreign KEY (id_secao) references t_briefing_secao (id_secao),
    constraint fkorlkhjah28n0dj740xt70odck foreign KEY (id_org_unidade) references t_org_unidade (id_unidade)
) TABLESPACE pg_default;