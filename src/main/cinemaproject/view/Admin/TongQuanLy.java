package main.cinemaproject.view.Admin;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author DinhAn
 */
public class TongQuanLy extends javax.swing.JPanel {

    /**
     * Creates new form TongQuanLy
     */
    public TongQuanLy() {
        initComponents();
        
        // Đặt màu cho quanLyPhimBut khi khởi tạo
        setColor(quanLyPhimBut);
        
        // Thêm ChangeListener cho jTabbedPane1
        Tab.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                // Kiểm tra tab hiện tại
                if (Tab.getSelectedComponent() == quanLyPhim1) {
                    setColor(quanLyPhimBut); // Đặt màu cho quanLyPhimBut
                    resetColor(quanLyRapChieuBut); // Đặt lại màu cho các nút khác
                    resetColor(quanLyXuatChieuBut);
                } else if (Tab.getSelectedComponent() == quanLyRap1) {
                    setColor(quanLyRapChieuBut); // Đặt màu cho quanLyRapChieuBut
                    resetColor(quanLyPhimBut); // Đặt lại màu cho các nút khác
                    resetColor(quanLyXuatChieuBut);
                } else {
                    resetColor(quanLyPhimBut); // Đặt lại màu nếu không phải tab QuanLyPhim1
                    resetColor(quanLyRapChieuBut); // Đặt lại màu nếu không phải tab quanLyRap1
                }
            }
        });
    }
    
    public void setColor(JPanel p)
    {
        p.setBackground(new Color(24,189,153,255));
    }
    
    public void resetColor(JPanel p)
    {
        p.setBackground(new Color(0,153,51));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        quanLyPhimBut = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        quanLyRapChieuBut = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        quanLyXuatChieuBut = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Tab = new javax.swing.JTabbedPane();
        quanLyPhim1 = new main.cinemaproject.view.Admin.QuanLyPhim();
        quanLyRap1 = new main.cinemaproject.view.Admin.QuanLyRap();

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 14, 11, 62));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(607, 14, 11, 62));

        quanLyPhimBut.setBackground(new java.awt.Color(0, 153, 51));
        quanLyPhimBut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quanLyPhimBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quanLyPhimButMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/film-50.png"))); // NOI18N
        jLabel1.setText("Quản Lý Phim");

        javax.swing.GroupLayout quanLyPhimButLayout = new javax.swing.GroupLayout(quanLyPhimBut);
        quanLyPhimBut.setLayout(quanLyPhimButLayout);
        quanLyPhimButLayout.setHorizontalGroup(
            quanLyPhimButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quanLyPhimButLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        quanLyPhimButLayout.setVerticalGroup(
            quanLyPhimButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel1.add(quanLyPhimBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 250, 50));

        quanLyRapChieuBut.setBackground(new java.awt.Color(0, 153, 51));
        quanLyRapChieuBut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quanLyRapChieuBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quanLyRapChieuButMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-theater-50.png"))); // NOI18N
        jLabel4.setText("Quản Lý Rạp");

        javax.swing.GroupLayout quanLyRapChieuButLayout = new javax.swing.GroupLayout(quanLyRapChieuBut);
        quanLyRapChieuBut.setLayout(quanLyRapChieuButLayout);
        quanLyRapChieuButLayout.setHorizontalGroup(
            quanLyRapChieuButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quanLyRapChieuButLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        quanLyRapChieuButLayout.setVerticalGroup(
            quanLyRapChieuButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quanLyRapChieuButLayout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(quanLyRapChieuBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, 50));

        quanLyXuatChieuBut.setBackground(new java.awt.Color(0, 153, 51));
        quanLyXuatChieuBut.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        quanLyXuatChieuBut.setPreferredSize(new java.awt.Dimension(250, 50));
        quanLyXuatChieuBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quanLyXuatChieuButMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icon/icons8-documentary-48.png"))); // NOI18N
        jLabel3.setText("Quản Lý Suất Chiếu");

        javax.swing.GroupLayout quanLyXuatChieuButLayout = new javax.swing.GroupLayout(quanLyXuatChieuBut);
        quanLyXuatChieuBut.setLayout(quanLyXuatChieuButLayout);
        quanLyXuatChieuButLayout.setHorizontalGroup(
            quanLyXuatChieuButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quanLyXuatChieuButLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        quanLyXuatChieuButLayout.setVerticalGroup(
            quanLyXuatChieuButLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, quanLyXuatChieuButLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jPanel1.add(quanLyXuatChieuBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 20, 270, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 90));

        Tab.addTab("tab1", quanLyPhim1);
        Tab.addTab("tab2", quanLyRap1);

        add(Tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 920, 580));
    }// </editor-fold>//GEN-END:initComponents

    private void quanLyPhimButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanLyPhimButMouseClicked
        Tab.setSelectedComponent(quanLyPhim1);
    }//GEN-LAST:event_quanLyPhimButMouseClicked

    private void quanLyRapChieuButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanLyRapChieuButMouseClicked
        Tab.setSelectedComponent(quanLyRap1);
    }//GEN-LAST:event_quanLyRapChieuButMouseClicked

    private void quanLyXuatChieuButMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quanLyXuatChieuButMouseClicked
        
    }//GEN-LAST:event_quanLyXuatChieuButMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private main.cinemaproject.view.Admin.QuanLyPhim quanLyPhim1;
    private javax.swing.JPanel quanLyPhimBut;
    private main.cinemaproject.view.Admin.QuanLyRap quanLyRap1;
    private javax.swing.JPanel quanLyRapChieuBut;
    private javax.swing.JPanel quanLyXuatChieuBut;
    // End of variables declaration//GEN-END:variables
}
