FILESEXTRAPATHS_prepend := "${THISDIR}:"

INTREE_DEFCONFIG = "rbiMx6ul_defconfig"
COMPATIBLE_MACHINE = "ruggedboard-imx6ul"

SRC_URI += "file://fragment.cfg \
            file://0001-Add-device-tree-support-for-RB-iMx6ul-in-kernel-4.14.patch \
	        file://0002-Add-wilc-driver-to-kernel-4.14-source.patch \
            file://0003-Add-defconfig-for-rb-iMx6ul.patch \
            file://0004-Added-support-for-1P.BIBI-TM2306DA070L-01-7-CTP-800R.patch \
            file://0005-Add-TM2131DA050C-5Inch-LCD-support-and-Disable-7Inch.patch \
"
