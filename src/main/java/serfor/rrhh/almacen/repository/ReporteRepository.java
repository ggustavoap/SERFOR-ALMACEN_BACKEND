package serfor.rrhh.almacen.repository;

import serfor.rrhh.almacen.entity.Page;
import serfor.rrhh.almacen.entity.Pageable;
import serfor.rrhh.almacen.entity.ReporteEntity;

import java.util.List;

public interface ReporteRepository {
    Pageable<List<ReporteEntity>> ListarReporteSalidas(String tipoTransferencia, Integer nuIdAlmacen,
                                                       String tipoEspecie, String periodo, Page page) throws Exception;

    Pageable<List<ReporteEntity>> ListarReporteIndicadores(Integer nuIdAlmacen,String periodo, Page page) throws Exception;
}
