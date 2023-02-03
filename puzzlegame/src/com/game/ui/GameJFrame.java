package com.game.ui;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {
    //游戏界面

    //创建二维数组
    //加载图片时会根据二维数组的数据加载
    int[][] data = new int[4][4];


    public GameJFrame() {
        //初始化界面
        initJFrame();


        //初始化菜单
        initJMenuBar();

        //初始化数据(打乱)
        initData();

        //初始化图片
        initImage();

        //让界面显示出来
        this.setVisible(true);
    }

    private void initData() {
        //定义一维数组
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //打乱数组中顺序
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //获取随机索引
            int index = r.nextInt(tempArr.length);
            //遍历每个数据，与随机索引交换
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        //给二维数组添加数据
        //方案一
        /*for (int i = 0; i < tempArr.length; i++) {
            data[i/4][i%4]=tempArr[i];
        }*/
        //方案二
        int count = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                data[i][j] = tempArr[count];
                count++;
            }
        }

    }

    private void initImage() {
        //外循环------列
        for (int i = 0; i < 4; i++) {
            //内循环-----行
            for (int j = 0; j < 4; j++) {
                //获取要加载图片的序号
                int num = data[i][j];
                //创建一个JLabel的对象(管理容器)
                JLabel jLabel = new JLabel(new ImageIcon("D:\\Test\\Java\\IdeaProject\\basic-code\\puzzlegame\\image\\animal\\animal4\\" + num + ".jpg"));
                //指定图片位置
                jLabel.setBounds(105 * j, 105 * i, 105, 105);
                //将管理容器添加到界面中
                this.getContentPane().add(jLabel);

            }
        }
    }

    private void initJMenuBar() {
        //创建整个菜单对象
        JMenuBar jMenuBar = new JMenuBar();

        //创建菜单选项的对象
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //创建选项下的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("联系方式");

        //将选项条目添加到选项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        //将选项添加到菜单中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //给整个界面设置菜单
        this.setJMenuBar(jMenuBar);
    }

    private void initJFrame() {
        //设置界面宽高
        this.setSize(603, 680);
        //设置界面标题
        this.setTitle("拼图单机版 v520.0");
        //界面置顶
        this.setAlwaysOnTop(true);
        //界面居中
        this.setLocationRelativeTo(null);
        //取消默认的居中放置
        this.setLayout(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
    }
}
