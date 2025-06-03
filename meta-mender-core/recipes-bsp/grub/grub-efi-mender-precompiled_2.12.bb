require grub-efi-mender-precompiled.inc

# Grub version 2.12
GRUB_MENDER_GRUBENV_REV = "089c619e3b52b95fd14dc664cf4f6c243c840b94"

SRC_URI = " \
    ${GRUB_MENDER_GRUBENV_SRC_URI} \
    ${URL_BASE}/${PV}-grub-mender-grubenv-${GRUB_MENDER_GRUBENV_REV}/${HOST_ARCH}/grub-efi-${EFI_BOOT_IMAGE};name=grub-efi \
    ${URL_BASE}/${PV}-grub-mender-grubenv-${GRUB_MENDER_GRUBENV_REV}/${HOST_ARCH}/grub-editenv;name=grub-editenv \
"

SRC_URI[grub-efi.sha256sum] = "f4507be84920234566490d256b4123f4b3722bb5661bb13b7586adff9f6a9399"
SRC_URI[grub-editenv.sha256sum] = "9548d47e82b84f4131a5086953509df6caef977a7bc0bb87cd5b63cdb255566d"