package main.cinemaproject.view.Customer;

import java.util.Date;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTabbedPane;

import main.cinemaproject.model.OrderItem;
import main.cinemaproject.controller.*;
import main.cinemaproject.model.Invoice;
import main.cinemaproject.model.ScreeningStatus;
import main.cinemaproject.model.Ticket;
import java.text.SimpleDateFormat;
/**
 *
 * @author DinhAn
 */
public class ThanhToan extends javax.swing.JPanel {
    private int screeningStatusId;
    private int movieId;
    private List<String> selectedSeats;
    private double tongTienHangTotal = 0; // Biến lưu tổng tiền hàng
    private String currentUsername;

    private MovieController movieController;
    private ScreeningStatusController screeningStatusController;
    private CustomerController customerController;
    private TicketController ticketController;
    private OrderItemController orderItemController;
    private InvoiceController invoiceController;
    private TheaterController theaterController;
    /**
     * Creates new form ThanhToan
     */
    public ThanhToan() {
        initComponents();
        movieController = new MovieController();
        screeningStatusController = new ScreeningStatusController();
        invoiceController = new InvoiceController();
        customerController = new CustomerController();
        ticketController = new TicketController();
        orderItemController = new OrderItemController();
        theaterController = new TheaterController();
    }

    //phương thức điền vào các thông tin phim dựa trên screeningStatusId
    public void fillMovieInfo(int screeningStatusId) {
        ScreeningStatus screeningStatus = screeningStatusController.getScreeningById(screeningStatusId);
        if (screeningStatus == null) {
            // Handle the case where the movie is not found
            System.out.println("Screening status not found for ID: " + screeningStatusId);
            return; // Exit the method if movie is null
        }
        tenPhim.setText(movieController.getMovieById(screeningStatus.getMovieId()).getName());
        ngayChieu.setText(screeningStatus.getShowdate().toString());
        gioChieu.setText(screeningStatus.getShowtime().toString());
        rap.setText(theaterController.getTheaterById(screeningStatus.getTheaterId()).getName());
        System.out.println("thetaer: "+screeningStatus.getTheaterId());
        giaVe1.setText(String.valueOf(screeningStatus.getPrice()));

        //gán giá trị cho movieId
        movieId = screeningStatus.getMovieId();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        phoneText = new javax.swing.JTextField();
        nameText = new javax.swing.JTextField();
        emailText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ThanhToan = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tenPhim = new javax.swing.JLabel();
        ngayChieu = new javax.swing.JLabel();
        gioChieu = new javax.swing.JLabel();
        rap = new javax.swing.JLabel();
        TongTienHang = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        soGhe1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        BangThanhToan = new javax.swing.JTable();
        giaVe1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        TongTienVe = new javax.swing.JLabel();
        backBut = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(920, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("THANH TOÁN HÓA ĐƠN");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 300, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("THÔNG TIN KHÁCH HÀNG");

        emailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTextActionPerformed(evt);
            }
        });

        jLabel3.setText("Số Điện Thoại");

        jLabel4.setText("Tên Người Dùng");

        jLabel5.setText("Email");

        ThanhToan.setText("Thanh Toán");
        ThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThanhToanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 3, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ThanhToan)
                            .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(72, 72, 72))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(53, 53, 53)
                .addComponent(ThanhToan)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 300, 400));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel4.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 0, 9, 520));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 222, 15));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel4.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, 230, 9));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Phim");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Đồ Ăn");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 17, -1, -1));

        jLabel8.setText("Tên Phim :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 141, -1, -1));

        jLabel9.setText("Ngày Chiếu :");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 179, -1, -1));

        jLabel10.setText("Giờ Chiếu :");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 217, -1, -1));

        jLabel11.setText("Rạp :");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 255, -1, -1));

        jLabel12.setText("Giá Vé :");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        tenPhim.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tenPhim.setText("TÊN PHIM");
        jPanel4.add(tenPhim, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 138, -1, -1));

        ngayChieu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ngayChieu.setText("TÊN PHIM");
        jPanel4.add(ngayChieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 176, -1, -1));

        gioChieu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        gioChieu.setText("TÊN PHIM");
        jPanel4.add(gioChieu, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 214, -1, -1));

        rap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rap.setText("TÊN PHIM");
        jPanel4.add(rap, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 252, -1, -1));

        TongTienHang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TongTienHang.setText("0");
        jPanel4.add(TongTienHang, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, 30));

        jLabel13.setText("Số Ghế :");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 293, -1, -1));

        soGhe1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        soGhe1.setText("TÊN PHIM");
        jPanel4.add(soGhe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 290, -1, -1));

        BangThanhToan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên SP", "Số Lượng", "Đơn Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(BangThanhToan);
        if (BangThanhToan.getColumnModel().getColumnCount() > 0) {
            BangThanhToan.getColumnModel().getColumn(0).setResizable(false);
            BangThanhToan.getColumnModel().getColumn(1).setResizable(false);
            BangThanhToan.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, 230, 360));

        giaVe1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        giaVe1.setText("TÊN PHIM");
        jPanel4.add(giaVe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, 20));

        jLabel15.setText("Tổng Tiền : ");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 460, -1, -1));

        jLabel16.setText("Tổng Tiền : ");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        TongTienVe.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TongTienVe.setText("TÊN PHIM");
        jPanel4.add(TongTienVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, 30));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, 500, 520));

        backBut.setText("Quay Lại");
        backBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButActionPerformed(evt);
            }
        });
        add(backBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void emailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTextActionPerformed

    private void backButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButActionPerformed
        int tabIndex = 2;
        JTabbedPane tabbedPane = (JTabbedPane) this.getParent();
        tabbedPane.setSelectedIndex(tabIndex);
    }//GEN-LAST:event_backButActionPerformed
    
    //chức năng thanh toán
    private void ThanhToanActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Customer customerFrame = (Customer) this.getTopLevelAncestor();

            // Kiểm tra thông tin người dùng
            if (nameText.getText().isEmpty() || phoneText.getText().isEmpty() || emailText.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ thông tin khách hàng.", "Thông báo", JOptionPane.WARNING_MESSAGE);
                return;
            }

            this.currentUsername = customerFrame.getUsername();

            // Kiểm tra xem tên người dùng có đúng không
            if (!nameText.getText().equals(currentUsername)) {
                JOptionPane.showMessageDialog(this, "Tên người dùng không đúng.", "Lỗi", JOptionPane.ERROR_MESSAGE);
              return;
            }
            // Tạo hóa đơn mới
            Invoice newInvoice = new Invoice();
            int customerId = customerController.getCustomerIdByUsername(nameText.getText());

            if (customerId == -1) {
                JOptionPane.showMessageDialog(this, "Khách hàng không tồn tại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return;
            }

            newInvoice.setCustomer_id(customerId);
            double tongTienVe = Double.parseDouble(TongTienVe.getText());
            double tongTienHang = tongTienHangTotal;
            newInvoice.setTotal_amount(tongTienVe + tongTienHang);
            newInvoice.setPurchase_date(new Date());
            int invoiceId = invoiceController.addInvoice(newInvoice);
            System.out.println(invoiceId);

            if (invoiceId == 0) {
                JOptionPane.showMessageDialog(this, "Lỗi khi tạo hóa đơn. Vui lòng thử lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return; // Thoát nếu không thành công
            }

            // Kiểm tra xem screeningStatusId có hợp lệ không
            if (screeningStatusId <= 0) {
                JOptionPane.showMessageDialog(this, "Lỗi: ID buổi chiếu không hợp lệ.", "Lỗi", JOptionPane.ERROR_MESSAGE);
                return; // Thoát nếu ID không hợp lệ
            }

            // Tạo vé mới cho mỗi ghế đã chọn
            for (String seat : selectedSeats) {
                boolean ticketCreated = createNewTicket(screeningStatusId, movieId, customerId, Double.parseDouble(giaVe1.getText()), new Date(), seat, invoiceId);
                if (!ticketCreated) {
                    JOptionPane.showMessageDialog(this, "Lỗi khi tạo vé cho ghế: " + seat, "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return; // Thoát nếu không thành công
                }
            }

            // Tạo các sản phẩm trong hóa đơn
            DefaultTableModel model = (DefaultTableModel) BangThanhToan.getModel();
            for (int i = 0; i < model.getRowCount(); i++) {
                addOrderItem(i, invoiceId, movieId, (int) model.getValueAt(i, 1), (double) model.getValueAt(i, 2));
            }

            // Tạo một optionPane trước khi thanh toán
            int totalAmount = (int) (tongTienVe + tongTienHang);
            int confirm = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thanh toán " + totalAmount + " VND không?", "Xác nhận thanh toán", JOptionPane.YES_NO_OPTION);
            if (confirm == JOptionPane.YES_OPTION) {
                // Thông báo thành công
                JOptionPane.showMessageDialog(null, "Thanh toán thành công!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                navigateToHomePage(); // Chuyển hướng đến trang ban đầu
            } else {
                return; // Thoát nếu không đồng ý thanh toán
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng kiểm tra lại thông tin nhập vào.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Lỗi trong quá trình thanh toán. Vui lòng thử lại.", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    public boolean createNewTicket(int screeningId, int movieId, int customerId, double price, Date purchaseDate, String seatNumber, int invoiceId) {
        Ticket newTicket = new Ticket();
        newTicket.setScreeningId(screeningId);
        newTicket.setMovieId(movieId);
        newTicket.setCustomerId(customerId);
        newTicket.setPrice(price);
        newTicket.setPurchaseDate(new SimpleDateFormat("yyyy-MM-dd").format(purchaseDate));
        newTicket.setSeatNumber(seatNumber);
        newTicket.setInvoiceId(invoiceId);
        
        return ticketController.addTicket(newTicket); // Giả sử phương thức này trả về true nếu thành công
    }

    public void addOrderItem(int id, int invoiceId, int productId, int quantity, double price) {
        OrderItem newOrderItem = new OrderItem();
        newOrderItem.setId(id);
        newOrderItem.setInvoiceId(invoiceId);
        newOrderItem.setProductId(productId);
        newOrderItem.setQuantity(quantity);
        newOrderItem.setPrice(price);
        
        orderItemController.addOrderItem(newOrderItem);
    }

    //id chiếu phim được lấy từ lichChieuPhim
    public void setScreeningStatusId(int screeningStatusId) {
        this.screeningStatusId = screeningStatusId;
        fillMovieInfo(screeningStatusId); 
    }

    //đặt giá trị cho các ghế được đặt từ chonGhe
    public void setSelectedSeats(List<String> selectedSeats) {
        this.selectedSeats = selectedSeats;
        soGhe1.setText(String.join(", ", selectedSeats));
        
        // Tính toán tổng tiền và cập nhật nhãn TongTienVe
        double giaVe = Double.parseDouble(giaVe1.getText()); // Lấy giá vé từ nhãn giaVe1
        int soLuongVe = selectedSeats.size(); // Số lượng ghế
        double tongTienVe = giaVe * soLuongVe; // Tính tổng tiền
        TongTienVe.setText(String.valueOf(tongTienVe)); // Cập nhật nhãn TongTienVe
    }

    public void addProductToOrder(String ten, int soLuong, double giaBan) {
        DefaultTableModel model = (DefaultTableModel) BangThanhToan.getModel();
        model.addRow(new Object[]{ten, soLuong, giaBan});
        
        // Cập nhật tổng tiền hàng
        double tongTienHang = soLuong * giaBan; // Tính tổng tiền cho sản phẩm mới
        tongTienHangTotal += tongTienHang; // Cộng dồn vào tổng tiền hàng
        TongTienHang.setText(String.valueOf(tongTienHangTotal)); // Cập nhật nhãn TongTienHang
    }
   
    //phươn thức chuyển về trang chủ.
    public void navigateToHomePage()
    {
        JTabbedPane tabbedPane = (JTabbedPane) this.getParent();
        int homeTabIndex = 0;
        tabbedPane.setSelectedIndex(homeTabIndex);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BangThanhToan;
    private javax.swing.JButton ThanhToan;
    private javax.swing.JLabel TongTienHang;
    private javax.swing.JLabel TongTienVe;
    private javax.swing.JButton backBut;
    private javax.swing.JTextField emailText;
    private javax.swing.JLabel giaVe1;
    private javax.swing.JLabel gioChieu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField nameText;
    private javax.swing.JLabel ngayChieu;
    private javax.swing.JTextField phoneText;
    private javax.swing.JLabel rap;
    private javax.swing.JLabel soGhe1;
    private javax.swing.JLabel tenPhim;
    // End of variables declaration//GEN-END:variables
}
